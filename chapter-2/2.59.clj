;; Exercise 2.59
;; Page 206

;; Implement the union-set operation for the
;; unordered-list representation of sets.

(defn element-of-set?
    [x set]
    (cond (empty? set) false
          (identical? x (first set)) true
          :else (element-of-set? x (rest set))))

(defn adjoin-set
    [x set]
    (if (element-of-set? x set)
        set
        (cons x set)))

(defn union-set
    [set1 set2]
    (cond 
        (and (empty? set1) (empty? set2)) '()
        (empty? set1) set2
        (empty? set2) set1
        :else (union-set (adjoin-set (first set2) set1) (rest set2))))