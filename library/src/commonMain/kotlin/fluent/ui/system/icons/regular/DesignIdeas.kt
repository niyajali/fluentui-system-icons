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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.DesignIdeas: ImageVector
    get() {
        if (_DesignIdeas != null) {
            return _DesignIdeas!!
        }
        _DesignIdeas = ImageVector.Builder(
            name = "Regular.DesignIdeas",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 2.75f)
                curveTo(6f, 2.462f, 5.835f, 2.199f, 5.575f, 2.074f)
                curveTo(5.315f, 1.949f, 5.007f, 1.984f, 4.781f, 2.164f)
                curveTo(3.471f, 3.213f, 2.758f, 4.132f, 2.383f, 4.932f)
                curveTo(2f, 5.749f, 2f, 6.382f, 2f, 6.75f)
                curveTo(2f, 7.696f, 2.477f, 8.53f, 3.204f, 9.025f)
                curveTo(3.013f, 9.185f, 2.843f, 9.382f, 2.698f, 9.618f)
                curveTo(2.222f, 10.388f, 2f, 11.564f, 2f, 13.255f)
                curveTo(2f, 14.967f, 2.23f, 17.023f, 2.605f, 18.664f)
                curveTo(2.791f, 19.481f, 3.022f, 20.233f, 3.297f, 20.799f)
                curveTo(3.434f, 21.08f, 3.601f, 21.354f, 3.808f, 21.569f)
                curveTo(4.013f, 21.78f, 4.33f, 22.005f, 4.75f, 22.005f)
                curveTo(5.17f, 22.005f, 5.487f, 21.78f, 5.692f, 21.569f)
                curveTo(5.899f, 21.354f, 6.066f, 21.08f, 6.203f, 20.799f)
                curveTo(6.478f, 20.233f, 6.709f, 19.481f, 6.895f, 18.664f)
                curveTo(7.27f, 17.023f, 7.5f, 14.967f, 7.5f, 13.255f)
                curveTo(7.5f, 11.564f, 7.278f, 10.388f, 6.802f, 9.618f)
                curveTo(6.657f, 9.382f, 6.487f, 9.185f, 6.296f, 9.025f)
                curveTo(7.023f, 8.53f, 7.5f, 7.696f, 7.5f, 6.75f)
                curveTo(7.5f, 5.823f, 7.064f, 5.176f, 6.732f, 4.682f)
                lineTo(6.703f, 4.639f)
                curveTo(6.312f, 4.058f, 6f, 3.58f, 6f, 2.75f)
                close()
                moveTo(3.5f, 6.75f)
                verticalLineTo(6.749f)
                curveTo(3.5f, 6.451f, 3.5f, 6.084f, 3.742f, 5.568f)
                curveTo(3.911f, 5.208f, 4.211f, 4.75f, 4.754f, 4.198f)
                curveTo(4.947f, 4.715f, 5.217f, 5.117f, 5.446f, 5.458f)
                lineTo(5.458f, 5.476f)
                curveTo(5.815f, 6.007f, 6f, 6.311f, 6f, 6.75f)
                curveTo(6f, 7.44f, 5.44f, 8f, 4.75f, 8f)
                curveTo(4.06f, 8f, 3.5f, 7.44f, 3.5f, 6.75f)
                close()
                moveTo(3.5f, 13.255f)
                curveTo(3.5f, 11.632f, 3.726f, 10.808f, 3.974f, 10.406f)
                curveTo(4.087f, 10.224f, 4.199f, 10.137f, 4.299f, 10.089f)
                curveTo(4.407f, 10.036f, 4.549f, 10.005f, 4.75f, 10.005f)
                curveTo(4.951f, 10.005f, 5.093f, 10.036f, 5.201f, 10.089f)
                curveTo(5.301f, 10.137f, 5.413f, 10.224f, 5.526f, 10.406f)
                curveTo(5.774f, 10.808f, 6f, 11.632f, 6f, 13.255f)
                curveTo(6f, 14.856f, 5.782f, 16.801f, 5.433f, 18.331f)
                curveTo(5.257f, 19.1f, 5.057f, 19.726f, 4.854f, 20.142f)
                curveTo(4.817f, 20.219f, 4.782f, 20.283f, 4.75f, 20.337f)
                curveTo(4.718f, 20.283f, 4.683f, 20.219f, 4.646f, 20.142f)
                curveTo(4.443f, 19.726f, 4.243f, 19.1f, 4.067f, 18.331f)
                curveTo(3.718f, 16.801f, 3.5f, 14.856f, 3.5f, 13.255f)
                close()
                moveTo(8.484f, 14.077f)
                curveTo(8.956f, 14.285f, 9.466f, 14.422f, 10f, 14.475f)
                verticalLineTo(12.25f)
                curveTo(10f, 10.455f, 11.455f, 9f, 13.25f, 9f)
                horizontalLineTo(15.475f)
                curveTo(15.224f, 6.473f, 13.093f, 4.5f, 10.5f, 4.5f)
                curveTo(9.643f, 4.5f, 8.836f, 4.716f, 8.131f, 5.096f)
                curveTo(7.951f, 4.702f, 7.74f, 4.388f, 7.583f, 4.156f)
                lineTo(7.533f, 4.082f)
                curveTo(7.467f, 3.983f, 7.407f, 3.894f, 7.354f, 3.81f)
                curveTo(8.286f, 3.294f, 9.359f, 3f, 10.5f, 3f)
                curveTo(13.922f, 3f, 16.726f, 5.644f, 16.981f, 9f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 9f, 22f, 10.455f, 22f, 12.25f)
                verticalLineTo(17.75f)
                curveTo(22f, 19.545f, 20.545f, 21f, 18.75f, 21f)
                horizontalLineTo(13.25f)
                curveTo(11.455f, 21f, 10f, 19.545f, 10f, 17.75f)
                verticalLineTo(15.981f)
                curveTo(9.436f, 15.938f, 8.893f, 15.823f, 8.379f, 15.646f)
                curveTo(8.43f, 15.116f, 8.465f, 14.588f, 8.484f, 14.077f)
                close()
                moveTo(18.75f, 10.5f)
                horizontalLineTo(16.924f)
                curveTo(16.493f, 13.289f, 14.289f, 15.493f, 11.5f, 15.924f)
                verticalLineTo(17.75f)
                curveTo(11.5f, 18.716f, 12.283f, 19.5f, 13.25f, 19.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 19.5f, 20.5f, 18.716f, 20.5f, 17.75f)
                verticalLineTo(12.25f)
                curveTo(20.5f, 11.283f, 19.716f, 10.5f, 18.75f, 10.5f)
                close()
                moveTo(11.5f, 14.4f)
                curveTo(13.459f, 14.002f, 15.002f, 12.459f, 15.4f, 10.5f)
                horizontalLineTo(13.25f)
                curveTo(12.283f, 10.5f, 11.5f, 11.283f, 11.5f, 12.25f)
                verticalLineTo(14.4f)
                close()
            }
        }.build()

        return _DesignIdeas!!
    }

@Suppress("ObjectPropertyName")
private var _DesignIdeas: ImageVector? = null

@Preview
@Composable
private fun DesignIdeasPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DesignIdeas, contentDescription = null)
    }
}
