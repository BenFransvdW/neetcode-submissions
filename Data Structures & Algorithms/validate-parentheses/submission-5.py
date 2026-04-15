class Solution:
    def isValid(self, s: str) -> bool:
        opening = ['(', '[', '{']
        stack = []
        for i in range(len(s)):
            if (s[i] in opening):
                stack.append(s[i])
            elif (not stack):
                return False
            elif (s[i] == ')'):
                if (stack and stack.pop() != '('):
                    return False
            elif (s[i] == ']'):
                if (stack and stack.pop() != '['):
                    return False
            elif (s[i] == '}'):
                if (stack and stack.pop() != '{'):
                    return False
        return not stack