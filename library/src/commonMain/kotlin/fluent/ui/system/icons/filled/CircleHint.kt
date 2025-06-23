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

public val FluentIcons.Filled.CircleHint: ImageVector
    get() {
        if (_CircleHint != null) {
            return _CircleHint!!
        }
        _CircleHint = ImageVector.Builder(
            name = "Filled.CircleHint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.696f, 4.222f)
                curveTo(7.466f, 3.668f, 6.805f, 3.431f, 6.312f, 3.772f)
                curveTo(5.32f, 4.459f, 4.459f, 5.32f, 3.772f, 6.311f)
                curveTo(3.43f, 6.804f, 3.668f, 7.465f, 4.222f, 7.695f)
                curveTo(4.693f, 7.89f, 5.231f, 7.7f, 5.531f, 7.288f)
                curveTo(6.022f, 6.615f, 6.616f, 6.022f, 7.288f, 5.532f)
                curveTo(7.7f, 5.231f, 7.891f, 4.694f, 7.696f, 4.222f)
                close()
                moveTo(10.758f, 4.095f)
                curveTo(10.253f, 4.174f, 9.739f, 3.928f, 9.543f, 3.457f)
                curveTo(9.314f, 2.903f, 9.614f, 2.267f, 10.204f, 2.16f)
                curveTo(10.785f, 2.055f, 11.385f, 2f, 11.997f, 2f)
                curveTo(12.611f, 2f, 13.211f, 2.055f, 13.794f, 2.161f)
                curveTo(14.384f, 2.268f, 14.684f, 2.904f, 14.454f, 3.458f)
                curveTo(14.259f, 3.929f, 13.744f, 4.175f, 13.24f, 4.096f)
                curveTo(12.835f, 4.033f, 12.42f, 4f, 11.997f, 4f)
                curveTo(11.575f, 4f, 11.161f, 4.033f, 10.758f, 4.095f)
                close()
                moveTo(19.773f, 7.696f)
                curveTo(19.301f, 7.891f, 18.764f, 7.701f, 18.463f, 7.289f)
                curveTo(17.973f, 6.617f, 17.38f, 6.024f, 16.708f, 5.534f)
                curveTo(16.296f, 5.233f, 16.106f, 4.696f, 16.301f, 4.224f)
                curveTo(16.531f, 3.67f, 17.192f, 3.433f, 17.685f, 3.774f)
                curveTo(18.676f, 4.461f, 19.536f, 5.321f, 20.223f, 6.312f)
                curveTo(20.564f, 6.805f, 20.327f, 7.466f, 19.773f, 7.696f)
                close()
                moveTo(20.54f, 14.454f)
                curveTo(20.069f, 14.259f, 19.823f, 13.744f, 19.902f, 13.24f)
                curveTo(19.964f, 12.836f, 19.997f, 12.422f, 19.997f, 12f)
                curveTo(19.997f, 11.577f, 19.964f, 11.162f, 19.901f, 10.757f)
                curveTo(19.823f, 10.253f, 20.068f, 9.738f, 20.539f, 9.543f)
                curveTo(21.093f, 9.313f, 21.729f, 9.613f, 21.836f, 10.203f)
                curveTo(21.942f, 10.786f, 21.997f, 11.386f, 21.997f, 12f)
                curveTo(21.997f, 12.612f, 21.942f, 13.212f, 21.837f, 13.794f)
                curveTo(21.73f, 14.384f, 21.094f, 14.683f, 20.54f, 14.454f)
                close()
                moveTo(16.302f, 19.775f)
                curveTo(16.107f, 19.304f, 16.298f, 18.766f, 16.709f, 18.465f)
                curveTo(17.382f, 17.975f, 17.975f, 17.382f, 18.465f, 16.709f)
                curveTo(18.766f, 16.297f, 19.303f, 16.106f, 19.774f, 16.302f)
                curveTo(20.329f, 16.531f, 20.566f, 17.192f, 20.225f, 17.685f)
                curveTo(19.538f, 18.677f, 18.678f, 19.538f, 17.687f, 20.225f)
                curveTo(17.194f, 20.566f, 16.532f, 20.329f, 16.302f, 19.775f)
                close()
                moveTo(9.542f, 20.543f)
                curveTo(9.737f, 20.071f, 10.252f, 19.826f, 10.756f, 19.904f)
                curveTo(11.161f, 19.967f, 11.575f, 20f, 11.997f, 20f)
                curveTo(12.42f, 20f, 12.836f, 19.967f, 13.241f, 19.904f)
                curveTo(13.745f, 19.825f, 14.26f, 20.071f, 14.456f, 20.542f)
                curveTo(14.685f, 21.096f, 14.386f, 21.732f, 13.796f, 21.839f)
                curveTo(13.212f, 21.945f, 12.611f, 22f, 11.997f, 22f)
                curveTo(11.384f, 22f, 10.785f, 21.945f, 10.202f, 21.839f)
                curveTo(9.612f, 21.732f, 9.313f, 21.097f, 9.542f, 20.543f)
                close()
                moveTo(4.22f, 16.302f)
                curveTo(4.692f, 16.107f, 5.229f, 16.298f, 5.53f, 16.71f)
                curveTo(6.021f, 17.383f, 6.614f, 17.976f, 7.287f, 18.467f)
                curveTo(7.699f, 18.768f, 7.89f, 19.306f, 7.695f, 19.777f)
                curveTo(7.465f, 20.331f, 6.804f, 20.568f, 6.311f, 20.227f)
                curveTo(5.319f, 19.54f, 4.457f, 18.678f, 3.77f, 17.686f)
                curveTo(3.429f, 17.193f, 3.666f, 16.532f, 4.22f, 16.302f)
                close()
                moveTo(3.455f, 9.542f)
                curveTo(3.926f, 9.737f, 4.172f, 10.252f, 4.093f, 10.756f)
                curveTo(4.03f, 11.162f, 3.997f, 11.577f, 3.997f, 12f)
                curveTo(3.997f, 12.422f, 4.03f, 12.836f, 4.093f, 13.241f)
                curveTo(4.171f, 13.745f, 3.926f, 14.26f, 3.454f, 14.455f)
                curveTo(2.9f, 14.684f, 2.265f, 14.385f, 2.158f, 13.795f)
                curveTo(2.052f, 13.212f, 1.997f, 12.613f, 1.997f, 12f)
                curveTo(1.997f, 11.386f, 2.052f, 10.785f, 2.158f, 10.202f)
                curveTo(2.265f, 9.612f, 2.901f, 9.312f, 3.455f, 9.542f)
                close()
            }
        }.build()

        return _CircleHint!!
    }

@Suppress("ObjectPropertyName")
private var _CircleHint: ImageVector? = null

@Preview
@Composable
private fun CircleHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CircleHint, contentDescription = null)
    }
}
