;; Exercise 2.17
;; Page 139

;; Define a procedure last-pair that returns
;; the list that contains only the last element of a given (nonempty)
;; list:

(defn last-pair
    [l]
    (if (empty? (rest l))
        l
        (last-pair (rest l))))