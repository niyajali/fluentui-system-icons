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
 * Pentagon icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: pentagon
 * - Source: ic_fluent_pentagon_20_regular.svg
 * 
 * @return The [ImageVector] for the Pentagon icon.
 */
public val FluentIcons.Regular.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.392f, 1.648f)
                curveTo(9.349f, 0.78f, 10.809f, 0.784f, 11.761f, 1.658f)
                lineTo(17.192f, 6.639f)
                curveTo(17.92f, 7.307f, 18.187f, 8.342f, 17.871f, 9.279f)
                lineTo(15.845f, 15.297f)
                curveTo(15.502f, 16.314f, 14.549f, 16.999f, 13.476f, 16.999f)
                horizontalLineTo(6.649f)
                curveTo(5.596f, 16.999f, 4.656f, 16.34f, 4.298f, 15.349f)
                lineTo(2.149f, 9.402f)
                curveTo(1.804f, 8.448f, 2.07f, 7.381f, 2.821f, 6.7f)
                lineTo(8.392f, 1.648f)
                close()
                moveTo(11.085f, 2.395f)
                curveTo(10.514f, 1.871f, 9.638f, 1.868f, 9.064f, 2.389f)
                lineTo(3.492f, 7.441f)
                curveTo(3.042f, 7.849f, 2.883f, 8.49f, 3.089f, 9.062f)
                lineTo(5.238f, 15.009f)
                curveTo(5.453f, 15.603f, 6.017f, 15.999f, 6.649f, 15.999f)
                horizontalLineTo(13.476f)
                curveTo(14.12f, 15.999f, 14.692f, 15.588f, 14.897f, 14.978f)
                lineTo(16.924f, 8.96f)
                curveTo(17.113f, 8.397f, 16.953f, 7.776f, 16.516f, 7.376f)
                lineTo(11.085f, 2.395f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

@Suppress("ObjectPropertyName")
private var _pentagon: ImageVector? = null

@Preview
@Composable
private fun PentagonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Pentagon, contentDescription = null)
    }
}

