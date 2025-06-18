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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.PersonTag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonTag",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.998f, 13.996f)
            verticalLineTo(15.496f)
            horizontalLineTo(4.249f)
            curveTo(3.836f, 15.496f, 3.5f, 15.831f, 3.5f, 16.244f)
            verticalLineTo(16.822f)
            curveTo(3.5f, 17.358f, 3.691f, 17.876f, 4.039f, 18.283f)
            curveTo(5.293f, 19.751f, 7.259f, 20.497f, 9.998f, 20.497f)
            curveTo(11.104f, 20.497f, 12.084f, 20.375f, 12.943f, 20.134f)
            lineTo(14.114f, 21.326f)
            curveTo(12.934f, 21.774f, 11.559f, 21.997f, 9.998f, 21.997f)
            curveTo(6.852f, 21.997f, 4.465f, 21.092f, 2.898f, 19.257f)
            curveTo(2.319f, 18.579f, 2f, 17.715f, 2f, 16.822f)
            verticalLineTo(16.244f)
            curveTo(2f, 15.002f, 3.007f, 13.996f, 4.249f, 13.996f)
            horizontalLineTo(10.998f)
            close()
            moveTo(14.999f, 7f)
            curveTo(14.999f, 4.239f, 12.76f, 2f, 9.998f, 2f)
            curveTo(7.236f, 2f, 4.997f, 4.239f, 4.997f, 7f)
            curveTo(4.997f, 9.762f, 7.236f, 12f, 9.998f, 12f)
            curveTo(12.76f, 12f, 14.999f, 9.762f, 14.999f, 7f)
            close()
            moveTo(6.497f, 7f)
            curveTo(6.497f, 5.067f, 8.065f, 3.5f, 9.998f, 3.5f)
            curveTo(11.932f, 3.5f, 13.499f, 5.067f, 13.499f, 7f)
            curveTo(13.499f, 8.933f, 11.932f, 10.5f, 9.998f, 10.5f)
            curveTo(8.065f, 10.5f, 6.497f, 8.933f, 6.497f, 7f)
            close()
            moveTo(16.571f, 22.4f)
            lineTo(12.57f, 18.328f)
            curveTo(12.204f, 17.954f, 11.998f, 17.453f, 11.998f, 16.931f)
            verticalLineTo(13.994f)
            curveTo(11.998f, 12.892f, 12.894f, 11.999f, 14f, 11.998f)
            lineTo(16.918f, 11.996f)
            curveTo(17.446f, 11.995f, 17.952f, 12.203f, 18.328f, 12.573f)
            lineTo(22.404f, 16.587f)
            curveTo(23.194f, 17.364f, 23.199f, 18.632f, 22.417f, 19.415f)
            lineTo(19.423f, 22.412f)
            curveTo(18.636f, 23.201f, 17.353f, 23.195f, 16.571f, 22.4f)
            close()
            moveTo(14.995f, 15.996f)
            curveTo(15.547f, 15.996f, 15.994f, 15.548f, 15.994f, 14.996f)
            curveTo(15.994f, 14.443f, 15.547f, 13.996f, 14.995f, 13.996f)
            curveTo(14.443f, 13.996f, 13.996f, 14.443f, 13.996f, 14.996f)
            curveTo(13.996f, 15.548f, 14.443f, 15.996f, 14.995f, 15.996f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonTagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonTag, contentDescription = null)
    }
}
