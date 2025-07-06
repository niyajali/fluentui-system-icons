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
 * Multiplier18x Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon, stream
 * - Description: Used to represent video speed. Contains number variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_multiplier_1_8x_24_filled.svg)
 * 
 * @return The [ImageVector] for the Multiplier18x icon.
 */
public val FluentIcons.Filled.Multiplier18x: ImageVector
    get() {
        if (_multiplier18x != null) {
            return _multiplier18x!!
        }
        _multiplier18x = Builder(name = "Multiplier18x", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 9.5f)
                curveTo(16.0f, 10.159f, 15.762f, 10.732f, 15.379f, 11.182f)
                curveTo(16.068f, 11.822f, 16.5f, 12.736f, 16.5f, 13.75f)
                curveTo(16.5f, 15.683f, 14.933f, 17.25f, 13.0f, 17.25f)
                curveTo(11.067f, 17.25f, 9.5f, 15.683f, 9.5f, 13.75f)
                curveTo(9.5f, 12.736f, 9.932f, 11.822f, 10.621f, 11.182f)
                curveTo(10.238f, 10.732f, 10.0f, 10.159f, 10.0f, 9.5f)
                curveTo(10.0f, 7.86f, 11.473f, 6.75f, 13.0f, 6.75f)
                curveTo(14.527f, 6.75f, 16.0f, 7.86f, 16.0f, 9.5f)
                close()
                moveTo(13.0f, 8.75f)
                curveTo(12.318f, 8.75f, 12.0f, 9.207f, 12.0f, 9.5f)
                curveTo(12.0f, 9.793f, 12.318f, 10.25f, 13.0f, 10.25f)
                curveTo(13.682f, 10.25f, 14.0f, 9.793f, 14.0f, 9.5f)
                curveTo(14.0f, 9.207f, 13.682f, 8.75f, 13.0f, 8.75f)
                close()
                moveTo(11.5f, 13.75f)
                curveTo(11.5f, 14.578f, 12.172f, 15.25f, 13.0f, 15.25f)
                curveTo(13.828f, 15.25f, 14.5f, 14.578f, 14.5f, 13.75f)
                curveTo(14.5f, 12.922f, 13.828f, 12.25f, 13.0f, 12.25f)
                curveTo(12.172f, 12.25f, 11.5f, 12.922f, 11.5f, 13.75f)
                close()
                moveTo(7.75f, 17.0f)
                curveTo(8.164f, 17.0f, 8.5f, 16.664f, 8.5f, 16.25f)
                curveTo(8.5f, 15.836f, 8.164f, 15.5f, 7.75f, 15.5f)
                curveTo(7.336f, 15.5f, 7.0f, 15.836f, 7.0f, 16.25f)
                curveTo(7.0f, 16.664f, 7.336f, 17.0f, 7.75f, 17.0f)
                close()
                moveTo(17.293f, 12.293f)
                curveTo(17.683f, 11.902f, 18.317f, 11.902f, 18.707f, 12.293f)
                lineTo(19.5f, 13.086f)
                lineTo(20.293f, 12.293f)
                curveTo(20.683f, 11.902f, 21.317f, 11.902f, 21.707f, 12.293f)
                curveTo(22.098f, 12.683f, 22.098f, 13.317f, 21.707f, 13.707f)
                lineTo(20.914f, 14.5f)
                lineTo(21.707f, 15.293f)
                curveTo(22.098f, 15.683f, 22.098f, 16.317f, 21.707f, 16.707f)
                curveTo(21.317f, 17.098f, 20.683f, 17.098f, 20.293f, 16.707f)
                lineTo(19.5f, 15.914f)
                lineTo(18.707f, 16.707f)
                curveTo(18.317f, 17.098f, 17.683f, 17.098f, 17.293f, 16.707f)
                curveTo(16.902f, 16.317f, 16.902f, 15.683f, 17.293f, 15.293f)
                lineTo(18.086f, 14.5f)
                lineTo(17.293f, 13.707f)
                curveTo(16.902f, 13.317f, 16.902f, 12.683f, 17.293f, 12.293f)
                close()
                moveTo(6.0f, 7.902f)
                curveTo(6.0f, 7.453f, 5.702f, 7.06f, 5.27f, 6.939f)
                curveTo(4.839f, 6.818f, 4.379f, 6.999f, 4.146f, 7.382f)
                curveTo(4.122f, 7.422f, 4.097f, 7.462f, 4.073f, 7.502f)
                curveTo(3.67f, 8.169f, 3.231f, 8.895f, 1.986f, 9.643f)
                curveTo(1.512f, 9.927f, 1.359f, 10.541f, 1.643f, 11.014f)
                curveTo(1.927f, 11.488f, 2.541f, 11.642f, 3.015f, 11.358f)
                curveTo(3.392f, 11.131f, 3.718f, 10.901f, 4.0f, 10.672f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 16.552f, 4.448f, 17.0f, 5.0f, 17.0f)
                curveTo(5.553f, 17.0f, 6.0f, 16.552f, 6.0f, 16.0f)
                verticalLineTo(7.902f)
                close()
            }
        }
        .build()
        return _multiplier18x!!
    }

@Suppress("ObjectPropertyName")
private var _multiplier18x: ImageVector? = null

@Preview
@Composable
private fun Multiplier18xPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Multiplier18x, contentDescription = "Multiplier18x Icon")
    }
}

