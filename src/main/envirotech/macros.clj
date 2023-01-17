(ns envirotech.macros)

(defmacro p [& contents]
  `(apply conj [:p {:class []}] ~contents))
