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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.GlobeVideo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.GlobeVideo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 1.999f)
            curveTo(17.523f, 1.999f, 22.001f, 6.477f, 22.001f, 12.001f)
            curveTo(22.001f, 12.688f, 21.932f, 13.359f, 21.8f, 14.007f)
            curveTo(21.448f, 14.041f, 21.094f, 14.172f, 20.776f, 14.417f)
            lineTo(20.76f, 14.429f)
            curveTo(20.646f, 14.189f, 20.495f, 13.971f, 20.315f, 13.78f)
            curveTo(20.437f, 13.206f, 20.501f, 12.611f, 20.501f, 12.001f)
            curveTo(20.501f, 11.311f, 20.419f, 10.641f, 20.264f, 9.999f)
            lineTo(16.906f, 10f)
            curveTo(16.969f, 10.647f, 17.001f, 11.317f, 17.001f, 12.001f)
            curveTo(17.001f, 12.338f, 16.993f, 12.671f, 16.978f, 13f)
            horizontalLineTo(15.475f)
            curveTo(15.492f, 12.672f, 15.501f, 12.339f, 15.501f, 12.001f)
            curveTo(15.501f, 11.31f, 15.465f, 10.64f, 15.396f, 10f)
            horizontalLineTo(8.603f)
            curveTo(8.535f, 10.64f, 8.498f, 11.31f, 8.498f, 12.001f)
            curveTo(8.498f, 13.06f, 8.584f, 14.07f, 8.738f, 15.001f)
            horizontalLineTo(11.05f)
            curveTo(11.017f, 15.162f, 11f, 15.329f, 11f, 15.5f)
            verticalLineTo(16.5f)
            horizontalLineTo(9.061f)
            curveTo(9.521f, 18.205f, 10.222f, 19.498f, 11f, 20.11f)
            verticalLineTo(21.5f)
            curveTo(11f, 21.656f, 11.014f, 21.809f, 11.042f, 21.957f)
            curveTo(5.967f, 21.475f, 1.998f, 17.201f, 1.998f, 12.001f)
            curveTo(1.998f, 6.477f, 6.476f, 1.999f, 12f, 1.999f)
            close()
            moveTo(7.508f, 16.501f)
            lineTo(4.785f, 16.501f)
            curveTo(5.744f, 18.034f, 7.177f, 19.239f, 8.88f, 19.911f)
            curveTo(8.357f, 19.091f, 7.926f, 18.065f, 7.609f, 16.896f)
            lineTo(7.508f, 16.501f)
            close()
            moveTo(7.093f, 10f)
            horizontalLineTo(3.735f)
            lineTo(3.731f, 10.017f)
            curveTo(3.579f, 10.653f, 3.498f, 11.318f, 3.498f, 12.001f)
            curveTo(3.498f, 13.057f, 3.691f, 14.068f, 4.043f, 15.001f)
            lineTo(7.216f, 15f)
            curveTo(7.073f, 14.051f, 6.998f, 13.043f, 6.998f, 12.001f)
            curveTo(6.998f, 11.317f, 7.031f, 10.647f, 7.093f, 10f)
            close()
            moveTo(8.881f, 4.09f)
            lineTo(8.858f, 4.098f)
            curveTo(6.81f, 4.913f, 5.154f, 6.5f, 4.25f, 8.5f)
            lineTo(7.298f, 8.501f)
            curveTo(7.611f, 6.748f, 8.158f, 5.222f, 8.881f, 4.09f)
            close()
            moveTo(12f, 3.499f)
            lineTo(11.884f, 3.504f)
            curveTo(10.618f, 3.62f, 9.396f, 5.622f, 8.828f, 8.5f)
            horizontalLineTo(15.171f)
            curveTo(14.605f, 5.63f, 13.387f, 3.631f, 12.126f, 3.505f)
            lineTo(12f, 3.499f)
            close()
            moveTo(15.12f, 4.09f)
            lineTo(15.226f, 4.264f)
            curveTo(15.896f, 5.376f, 16.404f, 6.836f, 16.701f, 8.501f)
            lineTo(19.749f, 8.5f)
            curveTo(18.885f, 6.589f, 17.334f, 5.054f, 15.411f, 4.211f)
            lineTo(15.12f, 4.09f)
            close()
            moveTo(12f, 15.5f)
            curveTo(12f, 14.672f, 12.672f, 14f, 13.5f, 14f)
            horizontalLineTo(18.5f)
            curveTo(19.328f, 14f, 20f, 14.672f, 20f, 15.5f)
            verticalLineTo(16.275f)
            lineTo(21.385f, 15.209f)
            curveTo(22.043f, 14.704f, 22.995f, 15.172f, 22.995f, 16.002f)
            verticalLineTo(20.994f)
            curveTo(22.995f, 21.824f, 22.043f, 22.293f, 21.385f, 21.787f)
            lineTo(20f, 20.721f)
            verticalLineTo(21.5f)
            curveTo(20f, 22.328f, 19.328f, 23f, 18.5f, 23f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 23f, 12f, 22.328f, 12f, 21.5f)
            verticalLineTo(15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GlobeVideoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GlobeVideo, contentDescription = null)
    }
}
