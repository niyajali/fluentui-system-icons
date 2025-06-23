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

public val FluentIcons.Filled.AttachArrowRight: ImageVector
    get() {
        if (_AttachArrowRight != null) {
            return _AttachArrowRight!!
        }
        _AttachArrowRight = ImageVector.Builder(
            name = "Filled.AttachArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.001f, 2f)
                curveTo(19.315f, 2f, 22.001f, 4.686f, 22.001f, 8f)
                curveTo(22.001f, 9.411f, 21.51f, 10.747f, 20.639f, 11.806f)
                curveTo(20.007f, 11.457f, 19.309f, 11.21f, 18.57f, 11.087f)
                lineTo(18.8f, 10.857f)
                lineTo(18.959f, 10.693f)
                curveTo(19.624f, 9.963f, 20.001f, 9.012f, 20.001f, 8f)
                curveTo(20.001f, 5.791f, 18.21f, 4f, 16.001f, 4f)
                curveTo(14.939f, 4f, 13.946f, 4.415f, 13.206f, 5.139f)
                lineTo(13.051f, 5.298f)
                lineTo(13.033f, 5.311f)
                lineTo(3.707f, 14.64f)
                curveTo(3.317f, 15.031f, 2.684f, 15.031f, 2.293f, 14.641f)
                curveTo(1.902f, 14.25f, 1.902f, 13.617f, 2.293f, 13.226f)
                lineTo(11.602f, 3.913f)
                lineTo(11.648f, 3.87f)
                curveTo(12.772f, 2.686f, 14.333f, 2f, 16.001f, 2f)
                close()
                moveTo(11.088f, 18.568f)
                curveTo(11.212f, 19.318f, 11.464f, 20.024f, 11.821f, 20.664f)
                lineTo(11.48f, 21.005f)
                lineTo(11.427f, 21.055f)
                lineTo(11.371f, 21.1f)
                curveTo(10.702f, 21.676f, 9.847f, 22f, 8.944f, 22f)
                curveTo(6.889f, 22f, 5.223f, 20.334f, 5.223f, 18.279f)
                curveTo(5.223f, 17.378f, 5.546f, 16.525f, 6.118f, 15.857f)
                lineTo(6.267f, 15.694f)
                lineTo(6.282f, 15.683f)
                lineTo(13.573f, 8.379f)
                curveTo(13.963f, 7.988f, 14.596f, 7.987f, 14.987f, 8.378f)
                curveTo(15.378f, 8.768f, 15.378f, 9.401f, 14.988f, 9.792f)
                lineTo(7.697f, 17.096f)
                lineTo(7.686f, 17.104f)
                curveTo(7.39f, 17.421f, 7.223f, 17.835f, 7.223f, 18.279f)
                curveTo(7.223f, 19.229f, 7.993f, 20f, 8.944f, 20f)
                curveTo(9.323f, 20f, 9.681f, 19.878f, 9.975f, 19.657f)
                lineTo(10.097f, 19.556f)
                lineTo(10.098f, 19.558f)
                lineTo(11.088f, 18.568f)
                close()
                moveTo(23.001f, 17.5f)
                curveTo(23.001f, 20.538f, 20.538f, 23f, 17.501f, 23f)
                curveTo(14.463f, 23f, 12.001f, 20.538f, 12.001f, 17.5f)
                curveTo(12.001f, 14.462f, 14.463f, 12f, 17.501f, 12f)
                curveTo(20.538f, 12f, 23.001f, 14.462f, 23.001f, 17.5f)
                close()
                moveTo(14.501f, 17f)
                curveTo(14.225f, 17f, 14.001f, 17.224f, 14.001f, 17.5f)
                curveTo(14.001f, 17.776f, 14.225f, 18f, 14.501f, 18f)
                lineTo(19.294f, 18f)
                lineTo(17.647f, 19.646f)
                curveTo(17.452f, 19.842f, 17.452f, 20.158f, 17.647f, 20.354f)
                curveTo(17.843f, 20.549f, 18.159f, 20.549f, 18.354f, 20.354f)
                lineTo(20.854f, 17.854f)
                curveTo(21.05f, 17.658f, 21.05f, 17.342f, 20.854f, 17.146f)
                lineTo(18.354f, 14.646f)
                curveTo(18.159f, 14.451f, 17.843f, 14.451f, 17.647f, 14.646f)
                curveTo(17.452f, 14.842f, 17.452f, 15.158f, 17.647f, 15.354f)
                lineTo(19.294f, 17f)
                lineTo(14.501f, 17f)
                close()
            }
        }.build()

        return _AttachArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _AttachArrowRight: ImageVector? = null

@Preview
@Composable
private fun AttachArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AttachArrowRight, contentDescription = null)
    }
}
