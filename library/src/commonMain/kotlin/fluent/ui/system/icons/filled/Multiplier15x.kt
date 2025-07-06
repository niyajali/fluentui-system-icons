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
 * Multiplier15x Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon, stream
 * - Description: Used to represent video speed. Contains number variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_multiplier_1_5x_24_filled.svg)
 * 
 * @return The [ImageVector] for the Multiplier15x icon.
 */
public val FluentIcons.Filled.Multiplier15x: ImageVector
    get() {
        if (_multiplier15x != null) {
            return _multiplier15x!!
        }
        _multiplier15x = Builder(name = "Multiplier15x", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 7.901f)
                curveTo(6.0f, 7.452f, 5.702f, 7.059f, 5.27f, 6.938f)
                curveTo(4.839f, 6.817f, 4.379f, 6.998f, 4.146f, 7.381f)
                curveTo(4.122f, 7.421f, 4.097f, 7.461f, 4.073f, 7.501f)
                curveTo(3.67f, 8.168f, 3.231f, 8.895f, 1.986f, 9.642f)
                curveTo(1.512f, 9.926f, 1.359f, 10.54f, 1.643f, 11.014f)
                curveTo(1.927f, 11.488f, 2.541f, 11.641f, 3.015f, 11.357f)
                curveTo(3.392f, 11.13f, 3.718f, 10.9f, 4.0f, 10.671f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 16.552f, 4.448f, 17.0f, 5.0f, 17.0f)
                curveTo(5.553f, 17.0f, 6.0f, 16.552f, 6.0f, 16.0f)
                verticalLineTo(7.901f)
                close()
                moveTo(11.0f, 6.999f)
                curveTo(10.502f, 6.999f, 10.08f, 7.365f, 10.01f, 7.858f)
                lineTo(9.51f, 11.358f)
                curveTo(9.465f, 11.672f, 9.572f, 11.989f, 9.798f, 12.212f)
                curveTo(10.024f, 12.435f, 10.342f, 12.537f, 10.656f, 12.488f)
                lineTo(12.476f, 12.2f)
                curveTo(13.407f, 12.053f, 14.25f, 12.773f, 14.25f, 13.716f)
                curveTo(14.25f, 14.563f, 13.563f, 15.25f, 12.715f, 15.25f)
                horizontalLineTo(12.444f)
                curveTo(12.004f, 15.25f, 11.579f, 15.09f, 11.249f, 14.799f)
                lineTo(10.911f, 14.5f)
                curveTo(10.497f, 14.135f, 9.865f, 14.174f, 9.5f, 14.589f)
                curveTo(9.134f, 15.003f, 9.174f, 15.635f, 9.588f, 16.0f)
                lineTo(9.926f, 16.299f)
                curveTo(10.622f, 16.912f, 11.517f, 17.25f, 12.444f, 17.25f)
                horizontalLineTo(12.715f)
                curveTo(14.667f, 17.25f, 16.25f, 15.668f, 16.25f, 13.716f)
                curveTo(16.25f, 11.544f, 14.309f, 9.885f, 12.164f, 10.224f)
                lineTo(11.681f, 10.3f)
                lineTo(11.867f, 8.999f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 8.999f, 16.0f, 8.551f, 16.0f, 7.999f)
                curveTo(16.0f, 7.447f, 15.552f, 6.999f, 15.0f, 6.999f)
                horizontalLineTo(11.0f)
                close()
                moveTo(18.707f, 12.293f)
                curveTo(18.317f, 11.902f, 17.683f, 11.902f, 17.293f, 12.293f)
                curveTo(16.902f, 12.683f, 16.902f, 13.316f, 17.293f, 13.707f)
                lineTo(18.086f, 14.5f)
                lineTo(17.293f, 15.293f)
                curveTo(16.902f, 15.684f, 16.902f, 16.317f, 17.293f, 16.707f)
                curveTo(17.683f, 17.098f, 18.317f, 17.098f, 18.707f, 16.707f)
                lineTo(19.5f, 15.914f)
                lineTo(20.293f, 16.707f)
                curveTo(20.683f, 17.098f, 21.317f, 17.098f, 21.707f, 16.707f)
                curveTo(22.098f, 16.317f, 22.098f, 15.684f, 21.707f, 15.293f)
                lineTo(20.914f, 14.5f)
                lineTo(21.707f, 13.707f)
                curveTo(22.098f, 13.316f, 22.098f, 12.683f, 21.707f, 12.293f)
                curveTo(21.317f, 11.902f, 20.683f, 11.902f, 20.293f, 12.293f)
                lineTo(19.5f, 13.086f)
                lineTo(18.707f, 12.293f)
                close()
                moveTo(8.5f, 16.25f)
                curveTo(8.5f, 16.664f, 8.164f, 17.0f, 7.75f, 17.0f)
                curveTo(7.336f, 17.0f, 7.0f, 16.664f, 7.0f, 16.25f)
                curveTo(7.0f, 15.836f, 7.336f, 15.5f, 7.75f, 15.5f)
                curveTo(8.164f, 15.5f, 8.5f, 15.836f, 8.5f, 16.25f)
                close()
            }
        }
        .build()
        return _multiplier15x!!
    }

@Suppress("ObjectPropertyName")
private var _multiplier15x: ImageVector? = null

@Preview
@Composable
private fun Multiplier15xPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Multiplier15x, contentDescription = "Multiplier15x Icon")
    }
}

