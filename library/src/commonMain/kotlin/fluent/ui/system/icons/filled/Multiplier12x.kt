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
 * Multiplier12x icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: multiplier12x
 * - Source: ic_fluent_multiplier_1_2x_24_filled.svg
 * 
 * @return The [ImageVector] for the Multiplier12x icon.
 */
public val FluentIcons.Filled.Multiplier12x: ImageVector
    get() {
        if (_multiplier12x != null) {
            return _multiplier12x!!
        }
        _multiplier12x = Builder(name = "Multiplier12x", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.343f, 10.488f)
                curveTo(10.883f, 10.573f, 11.391f, 10.21f, 11.485f, 9.673f)
                lineTo(11.484f, 9.675f)
                lineTo(11.485f, 9.669f)
                lineTo(11.487f, 9.659f)
                lineTo(11.487f, 9.661f)
                curveTo(11.491f, 9.643f, 11.502f, 9.608f, 11.518f, 9.562f)
                curveTo(11.551f, 9.468f, 11.608f, 9.345f, 11.698f, 9.225f)
                curveTo(11.85f, 9.023f, 12.149f, 8.75f, 12.85f, 8.75f)
                curveTo(13.573f, 8.75f, 13.915f, 8.969f, 14.077f, 9.175f)
                curveTo(14.251f, 9.395f, 14.395f, 9.823f, 14.264f, 10.581f)
                curveTo(14.204f, 10.931f, 14.056f, 11.101f, 13.791f, 11.262f)
                curveTo(13.537f, 11.416f, 13.264f, 11.513f, 12.89f, 11.647f)
                curveTo(12.729f, 11.705f, 12.548f, 11.769f, 12.342f, 11.848f)
                curveTo(11.741f, 12.077f, 10.992f, 12.415f, 10.414f, 13.096f)
                curveTo(9.815f, 13.801f, 9.5f, 14.748f, 9.5f, 16.0f)
                curveTo(9.5f, 16.265f, 9.605f, 16.52f, 9.793f, 16.707f)
                curveTo(9.98f, 16.895f, 10.235f, 17.0f, 10.5f, 17.0f)
                horizontalLineTo(15.25f)
                curveTo(15.802f, 17.0f, 16.25f, 16.552f, 16.25f, 16.0f)
                curveTo(16.25f, 15.448f, 15.802f, 15.0f, 15.25f, 15.0f)
                horizontalLineTo(11.622f)
                curveTo(11.706f, 14.716f, 11.823f, 14.527f, 11.938f, 14.391f)
                curveTo(12.177f, 14.11f, 12.527f, 13.918f, 13.056f, 13.716f)
                curveTo(13.155f, 13.678f, 13.27f, 13.637f, 13.395f, 13.593f)
                curveTo(13.83f, 13.438f, 14.385f, 13.241f, 14.828f, 12.972f)
                curveTo(15.498f, 12.566f, 16.061f, 11.937f, 16.236f, 10.919f)
                curveTo(16.423f, 9.827f, 16.292f, 8.755f, 15.649f, 7.938f)
                curveTo(14.994f, 7.106f, 13.977f, 6.75f, 12.85f, 6.75f)
                curveTo(11.479f, 6.75f, 10.603f, 7.352f, 10.098f, 8.025f)
                curveTo(9.86f, 8.342f, 9.717f, 8.657f, 9.634f, 8.891f)
                curveTo(9.592f, 9.009f, 9.563f, 9.111f, 9.544f, 9.188f)
                curveTo(9.535f, 9.227f, 9.528f, 9.26f, 9.523f, 9.286f)
                curveTo(9.52f, 9.299f, 9.518f, 9.31f, 9.516f, 9.32f)
                lineTo(9.514f, 9.333f)
                lineTo(9.513f, 9.338f)
                lineTo(9.513f, 9.341f)
                lineTo(9.513f, 9.342f)
                curveTo(9.513f, 9.342f, 9.482f, 9.533f, 9.512f, 9.343f)
                curveTo(9.426f, 9.888f, 9.797f, 10.401f, 10.343f, 10.488f)
                close()
                moveTo(5.27f, 6.939f)
                curveTo(5.702f, 7.06f, 6.0f, 7.453f, 6.0f, 7.902f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 16.552f, 5.553f, 17.0f, 5.0f, 17.0f)
                curveTo(4.448f, 17.0f, 4.0f, 16.552f, 4.0f, 16.0f)
                verticalLineTo(10.672f)
                curveTo(3.718f, 10.901f, 3.392f, 11.131f, 3.015f, 11.358f)
                curveTo(2.541f, 11.642f, 1.927f, 11.488f, 1.643f, 11.014f)
                curveTo(1.359f, 10.541f, 1.512f, 9.927f, 1.986f, 9.643f)
                curveTo(3.231f, 8.895f, 3.67f, 8.169f, 4.073f, 7.502f)
                curveTo(4.097f, 7.462f, 4.122f, 7.422f, 4.146f, 7.382f)
                curveTo(4.379f, 6.999f, 4.839f, 6.818f, 5.27f, 6.939f)
                close()
                moveTo(18.707f, 12.293f)
                curveTo(18.317f, 11.902f, 17.683f, 11.902f, 17.293f, 12.293f)
                curveTo(16.902f, 12.683f, 16.902f, 13.317f, 17.293f, 13.707f)
                lineTo(18.086f, 14.5f)
                lineTo(17.293f, 15.293f)
                curveTo(16.902f, 15.683f, 16.902f, 16.317f, 17.293f, 16.707f)
                curveTo(17.683f, 17.098f, 18.317f, 17.098f, 18.707f, 16.707f)
                lineTo(19.5f, 15.914f)
                lineTo(20.293f, 16.707f)
                curveTo(20.683f, 17.098f, 21.317f, 17.098f, 21.707f, 16.707f)
                curveTo(22.098f, 16.317f, 22.098f, 15.683f, 21.707f, 15.293f)
                lineTo(20.914f, 14.5f)
                lineTo(21.707f, 13.707f)
                curveTo(22.098f, 13.317f, 22.098f, 12.683f, 21.707f, 12.293f)
                curveTo(21.317f, 11.902f, 20.683f, 11.902f, 20.293f, 12.293f)
                lineTo(19.5f, 13.086f)
                lineTo(18.707f, 12.293f)
                close()
                moveTo(7.75f, 17.0f)
                curveTo(8.164f, 17.0f, 8.5f, 16.664f, 8.5f, 16.25f)
                curveTo(8.5f, 15.836f, 8.164f, 15.5f, 7.75f, 15.5f)
                curveTo(7.336f, 15.5f, 7.0f, 15.836f, 7.0f, 16.25f)
                curveTo(7.0f, 16.664f, 7.336f, 17.0f, 7.75f, 17.0f)
                close()
            }
        }
        .build()
        return _multiplier12x!!
    }

@Suppress("ObjectPropertyName")
private var _multiplier12x: ImageVector? = null

@Preview
@Composable
private fun Multiplier12xPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Multiplier12x, contentDescription = null)
    }
}

