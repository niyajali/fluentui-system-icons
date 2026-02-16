/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Quiz Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, forms
 * - Description: Used to represent a quiz in Forms.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_quiz_24_regular.svg)
 * 
 * @return The [ImageVector] for the Quiz icon.
 */
public val FluentIcons.Regular.Quiz: ImageVector
    get() {
        if (_quiz != null) {
            return _quiz!!
        }
        _quiz = Builder(name = "Quiz", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.25f, 16.5f)
                curveTo(17.664f, 16.5f, 18.0f, 16.836f, 18.0f, 17.25f)
                curveTo(18.0f, 17.664f, 17.664f, 18.0f, 17.25f, 18.0f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 18.0f, 6.0f, 17.664f, 6.0f, 17.25f)
                curveTo(6.0f, 16.836f, 6.336f, 16.5f, 6.75f, 16.5f)
                horizontalLineTo(17.25f)
                close()
                moveTo(17.25f, 13.499f)
                curveTo(17.664f, 13.499f, 18.0f, 13.835f, 18.0f, 14.249f)
                curveTo(18.0f, 14.663f, 17.664f, 14.999f, 17.25f, 14.999f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 14.999f, 6.0f, 14.663f, 6.0f, 14.249f)
                curveTo(6.0f, 13.835f, 6.336f, 13.499f, 6.75f, 13.499f)
                horizontalLineTo(17.25f)
                close()
                moveTo(10.0f, 4.996f)
                curveTo(10.305f, 4.996f, 10.579f, 5.181f, 10.694f, 5.463f)
                lineTo(12.941f, 10.966f)
                curveTo(13.098f, 11.349f, 12.915f, 11.787f, 12.531f, 11.943f)
                curveTo(12.148f, 12.1f, 11.709f, 11.916f, 11.553f, 11.532f)
                lineTo(11.13f, 10.497f)
                horizontalLineTo(8.868f)
                lineTo(8.444f, 11.533f)
                curveTo(8.288f, 11.917f, 7.849f, 12.1f, 7.466f, 11.943f)
                curveTo(7.083f, 11.786f, 6.899f, 11.348f, 7.056f, 10.965f)
                lineTo(9.306f, 5.463f)
                curveTo(9.421f, 5.181f, 9.695f, 4.996f, 10.0f, 4.996f)
                close()
                moveTo(15.75f, 4.996f)
                curveTo(16.164f, 4.996f, 16.5f, 5.332f, 16.5f, 5.746f)
                verticalLineTo(6.996f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 6.996f, 18.5f, 7.332f, 18.5f, 7.746f)
                curveTo(18.5f, 8.16f, 18.164f, 8.496f, 17.75f, 8.496f)
                horizontalLineTo(16.5f)
                verticalLineTo(9.746f)
                curveTo(16.5f, 10.16f, 16.164f, 10.496f, 15.75f, 10.496f)
                curveTo(15.336f, 10.496f, 15.0f, 10.16f, 15.0f, 9.746f)
                verticalLineTo(8.496f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 8.496f, 13.0f, 8.16f, 13.0f, 7.746f)
                curveTo(13.0f, 7.332f, 13.336f, 6.996f, 13.75f, 6.996f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.746f)
                curveTo(15.0f, 5.332f, 15.336f, 4.996f, 15.75f, 4.996f)
                close()
                moveTo(9.481f, 8.997f)
                horizontalLineTo(10.518f)
                lineTo(10.0f, 7.729f)
                lineTo(9.481f, 8.997f)
                close()
            }
        }
        .build()
        return _quiz!!
    }

@Suppress("ObjectPropertyName")
private var _quiz: ImageVector? = null

@Preview
@Composable
private fun QuizPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Quiz, contentDescription = "Quiz Icon")
    }
}

