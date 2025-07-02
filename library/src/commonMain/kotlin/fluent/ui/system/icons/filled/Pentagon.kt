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

package fluent.ui.system.icons.filled

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
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: pentagon
 * - Source: ic_fluent_pentagon_20_filled.svg
 * 
 * @return The [ImageVector] for the Pentagon icon.
 */
public val FluentIcons.Filled.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.761f, 1.658f)
                curveTo(10.809f, 0.784f, 9.349f, 0.78f, 8.392f, 1.648f)
                lineTo(2.821f, 6.7f)
                curveTo(2.07f, 7.381f, 1.804f, 8.448f, 2.149f, 9.402f)
                lineTo(4.298f, 15.349f)
                curveTo(4.656f, 16.34f, 5.596f, 16.999f, 6.649f, 16.999f)
                horizontalLineTo(13.476f)
                curveTo(14.549f, 16.999f, 15.502f, 16.314f, 15.845f, 15.297f)
                lineTo(17.871f, 9.279f)
                curveTo(18.187f, 8.342f, 17.92f, 7.307f, 17.192f, 6.639f)
                lineTo(11.761f, 1.658f)
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
        Image(imageVector = FluentIcons.Filled.Pentagon, contentDescription = null)
    }
}

