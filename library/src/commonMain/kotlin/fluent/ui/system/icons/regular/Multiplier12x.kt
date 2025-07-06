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
 * Multiplier12x Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, stream
 * - Description: Used to represent video speed. Contains number variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_multiplier_1_2x_24_regular.svg)
 * 
 * @return The [ImageVector] for the Multiplier12x icon.
 */
public val FluentIcons.Regular.Multiplier12x: ImageVector
    get() {
        if (_multiplier12x != null) {
            return _multiplier12x!!
        }
        _multiplier12x = Builder(name = "Multiplier12x", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.453f, 7.028f)
                curveTo(5.776f, 7.119f, 6.0f, 7.414f, 6.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(6.0f, 16.664f, 5.664f, 17.0f, 5.25f, 17.0f)
                curveTo(4.836f, 17.0f, 4.5f, 16.664f, 4.5f, 16.25f)
                verticalLineTo(9.833f)
                curveTo(4.118f, 10.202f, 3.66f, 10.579f, 3.136f, 10.893f)
                curveTo(2.781f, 11.106f, 2.32f, 10.991f, 2.107f, 10.636f)
                curveTo(1.894f, 10.281f, 2.009f, 9.82f, 2.364f, 9.607f)
                curveTo(3.04f, 9.202f, 3.604f, 8.642f, 4.006f, 8.168f)
                curveTo(4.205f, 7.933f, 4.36f, 7.726f, 4.463f, 7.579f)
                curveTo(4.514f, 7.506f, 4.553f, 7.448f, 4.577f, 7.41f)
                curveTo(4.59f, 7.391f, 4.599f, 7.377f, 4.604f, 7.369f)
                lineTo(4.609f, 7.36f)
                lineTo(4.61f, 7.359f)
                curveTo(4.785f, 7.072f, 5.129f, 6.937f, 5.453f, 7.028f)
                close()
                moveTo(10.418f, 10.246f)
                curveTo(10.826f, 10.29f, 11.194f, 9.998f, 11.244f, 9.592f)
                curveTo(11.245f, 9.589f, 11.246f, 9.581f, 11.248f, 9.57f)
                curveTo(11.253f, 9.546f, 11.262f, 9.505f, 11.279f, 9.452f)
                curveTo(11.312f, 9.345f, 11.372f, 9.204f, 11.472f, 9.066f)
                curveTo(11.649f, 8.822f, 12.011f, 8.5f, 12.85f, 8.5f)
                curveTo(13.623f, 8.5f, 14.05f, 8.736f, 14.274f, 9.02f)
                curveTo(14.506f, 9.315f, 14.648f, 9.823f, 14.51f, 10.623f)
                curveTo(14.435f, 11.063f, 14.228f, 11.313f, 13.898f, 11.529f)
                curveTo(13.617f, 11.713f, 13.308f, 11.84f, 12.922f, 11.999f)
                curveTo(12.762f, 12.065f, 12.588f, 12.137f, 12.398f, 12.22f)
                curveTo(11.806f, 12.479f, 11.119f, 12.833f, 10.593f, 13.482f)
                curveTo(10.053f, 14.148f, 9.75f, 15.04f, 9.75f, 16.25f)
                curveTo(9.75f, 16.449f, 9.829f, 16.64f, 9.969f, 16.78f)
                curveTo(10.11f, 16.921f, 10.301f, 17.0f, 10.5f, 17.0f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 17.0f, 16.0f, 16.664f, 16.0f, 16.25f)
                curveTo(16.0f, 15.836f, 15.664f, 15.5f, 15.25f, 15.5f)
                horizontalLineTo(11.308f)
                curveTo(11.393f, 14.998f, 11.565f, 14.665f, 11.759f, 14.426f)
                curveTo(12.05f, 14.066f, 12.462f, 13.829f, 12.999f, 13.594f)
                curveTo(13.113f, 13.544f, 13.239f, 13.492f, 13.373f, 13.437f)
                curveTo(13.804f, 13.261f, 14.31f, 13.052f, 14.721f, 12.783f)
                curveTo(15.326f, 12.387f, 15.83f, 11.805f, 15.989f, 10.877f)
                curveTo(16.169f, 9.827f, 16.037f, 8.835f, 15.452f, 8.092f)
                curveTo(14.859f, 7.339f, 13.926f, 7.0f, 12.85f, 7.0f)
                curveTo(11.53f, 7.0f, 10.717f, 7.553f, 10.258f, 8.184f)
                curveTo(10.041f, 8.484f, 9.918f, 8.78f, 9.848f, 9.001f)
                curveTo(9.813f, 9.113f, 9.79f, 9.208f, 9.776f, 9.28f)
                curveTo(9.769f, 9.315f, 9.764f, 9.345f, 9.761f, 9.369f)
                curveTo(9.759f, 9.38f, 9.758f, 9.391f, 9.756f, 9.399f)
                lineTo(9.755f, 9.41f)
                lineTo(9.755f, 9.415f)
                lineTo(9.754f, 9.417f)
                curveTo(9.754f, 9.419f, 9.711f, 9.816f, 9.754f, 9.419f)
                curveTo(9.709f, 9.83f, 10.006f, 10.201f, 10.418f, 10.246f)
                close()
                moveTo(18.281f, 12.22f)
                curveTo(17.988f, 11.927f, 17.513f, 11.927f, 17.22f, 12.22f)
                curveTo(16.927f, 12.513f, 16.927f, 12.987f, 17.22f, 13.28f)
                lineTo(18.439f, 14.5f)
                lineTo(17.22f, 15.72f)
                curveTo(16.927f, 16.013f, 16.927f, 16.487f, 17.22f, 16.78f)
                curveTo(17.513f, 17.073f, 17.988f, 17.073f, 18.281f, 16.78f)
                lineTo(19.5f, 15.561f)
                lineTo(20.72f, 16.78f)
                curveTo(21.013f, 17.073f, 21.487f, 17.073f, 21.78f, 16.78f)
                curveTo(22.073f, 16.487f, 22.073f, 16.013f, 21.78f, 15.72f)
                lineTo(20.561f, 14.5f)
                lineTo(21.78f, 13.28f)
                curveTo(22.073f, 12.987f, 22.073f, 12.513f, 21.78f, 12.22f)
                curveTo(21.487f, 11.927f, 21.013f, 11.927f, 20.72f, 12.22f)
                lineTo(19.5f, 13.439f)
                lineTo(18.281f, 12.22f)
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
        return _multiplier12x!!
    }

@Suppress("ObjectPropertyName")
private var _multiplier12x: ImageVector? = null

@Preview
@Composable
private fun Multiplier12xPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Multiplier12x, contentDescription = "Multiplier12x Icon")
    }
}

