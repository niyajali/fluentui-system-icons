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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.EmojiAngry: ImageVector
    get() {
        if (_EmojiAngry != null) {
            return _EmojiAngry!!
        }
        _EmojiAngry = ImageVector.Builder(
            name = "Filled.EmojiAngry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2.004f)
                curveTo(17.523f, 2.004f, 22f, 6.481f, 22f, 12.004f)
                curveTo(22f, 17.527f, 17.523f, 22.004f, 12f, 22.004f)
                curveTo(6.477f, 22.004f, 2f, 17.527f, 2f, 12.004f)
                curveTo(2f, 6.481f, 6.477f, 2.004f, 12f, 2.004f)
                close()
                moveTo(12f, 13.497f)
                curveTo(10.365f, 13.497f, 8.833f, 14.155f, 7.712f, 15.3f)
                curveTo(7.422f, 15.596f, 7.427f, 16.071f, 7.723f, 16.361f)
                curveTo(8.019f, 16.65f, 8.494f, 16.646f, 8.783f, 16.35f)
                curveTo(9.625f, 15.49f, 10.773f, 14.997f, 12f, 14.997f)
                curveTo(13.225f, 14.997f, 14.37f, 15.488f, 15.211f, 16.344f)
                curveTo(15.501f, 16.639f, 15.976f, 16.644f, 16.272f, 16.353f)
                curveTo(16.567f, 16.063f, 16.571f, 15.588f, 16.281f, 15.293f)
                curveTo(15.16f, 14.152f, 13.631f, 13.497f, 12f, 13.497f)
                close()
                moveTo(8.219f, 6.664f)
                lineTo(8.127f, 6.601f)
                curveTo(7.811f, 6.417f, 7.4f, 6.487f, 7.164f, 6.781f)
                curveTo(6.929f, 7.075f, 6.951f, 7.492f, 7.2f, 7.759f)
                lineTo(7.281f, 7.835f)
                lineTo(8.538f, 8.839f)
                curveTo(8.077f, 9.023f, 7.751f, 9.473f, 7.751f, 10f)
                curveTo(7.751f, 10.69f, 8.31f, 11.249f, 9f, 11.249f)
                curveTo(9.69f, 11.249f, 10.25f, 10.69f, 10.25f, 9.999f)
                curveTo(10.47f, 9.999f, 10.688f, 9.903f, 10.836f, 9.718f)
                curveTo(11.071f, 9.424f, 11.049f, 9.007f, 10.8f, 8.739f)
                lineTo(10.719f, 8.664f)
                lineTo(8.219f, 6.664f)
                lineTo(8.127f, 6.601f)
                lineTo(8.219f, 6.664f)
                close()
                moveTo(16.836f, 6.781f)
                curveTo(16.6f, 6.487f, 16.189f, 6.417f, 15.873f, 6.601f)
                lineTo(15.781f, 6.664f)
                lineTo(13.283f, 8.664f)
                lineTo(13.201f, 8.739f)
                curveTo(12.952f, 9.007f, 12.93f, 9.424f, 13.166f, 9.718f)
                curveTo(13.289f, 9.872f, 13.461f, 9.965f, 13.642f, 9.99f)
                lineTo(13.751f, 9.998f)
                curveTo(13.751f, 10.69f, 14.311f, 11.249f, 15f, 11.249f)
                curveTo(15.69f, 11.249f, 16.25f, 10.69f, 16.25f, 10f)
                curveTo(16.25f, 9.517f, 15.976f, 9.098f, 15.575f, 8.89f)
                lineTo(15.463f, 8.839f)
                lineTo(16.719f, 7.835f)
                lineTo(16.8f, 7.759f)
                curveTo(17.049f, 7.491f, 17.071f, 7.075f, 16.836f, 6.781f)
                close()
            }
        }.build()

        return _EmojiAngry!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiAngry: ImageVector? = null

@Preview
@Composable
private fun EmojiAngryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EmojiAngry, contentDescription = null)
    }
}
