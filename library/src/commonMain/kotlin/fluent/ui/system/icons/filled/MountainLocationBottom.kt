/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.MountainLocationBottom: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MountainLocationBottom",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.913f, 2.854f)
            curveTo(12.846f, 1.822f, 11.154f, 1.822f, 10.087f, 2.854f)
            lineTo(2.99f, 9.724f)
            curveTo(2.357f, 10.337f, 2f, 11.179f, 2f, 12.06f)
            verticalLineTo(18.75f)
            curveTo(2f, 19.993f, 3.007f, 21f, 4.25f, 21f)
            horizontalLineTo(10.29f)
            curveTo(9.865f, 20.428f, 9.358f, 19.702f, 8.934f, 18.97f)
            curveTo(8.691f, 18.552f, 8.466f, 18.114f, 8.298f, 17.688f)
            curveTo(8.136f, 17.276f, 8f, 16.806f, 8f, 16.343f)
            curveTo(8f, 15.255f, 8.435f, 14.191f, 9.122f, 13.397f)
            curveTo(9.81f, 12.6f, 10.819f, 12f, 12f, 12f)
            curveTo(13.181f, 12f, 14.19f, 12.6f, 14.878f, 13.397f)
            curveTo(15.564f, 14.191f, 16f, 15.255f, 16f, 16.343f)
            curveTo(16f, 16.806f, 15.864f, 17.276f, 15.702f, 17.688f)
            curveTo(15.534f, 18.114f, 15.309f, 18.552f, 15.066f, 18.97f)
            curveTo(14.642f, 19.702f, 14.135f, 20.428f, 13.71f, 21f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 21f, 22f, 19.993f, 22f, 18.75f)
            verticalLineTo(12.06f)
            curveTo(22f, 11.179f, 21.643f, 10.337f, 21.01f, 9.724f)
            lineTo(13.913f, 2.854f)
            close()
            moveTo(11.131f, 3.932f)
            curveTo(11.615f, 3.463f, 12.385f, 3.463f, 12.869f, 3.932f)
            lineTo(16.323f, 7.275f)
            curveTo(15.611f, 7.36f, 14.939f, 7.531f, 14.302f, 7.739f)
            curveTo(13.62f, 7.961f, 12.918f, 8.25f, 12.261f, 8.52f)
            curveTo(11.874f, 8.679f, 11.502f, 8.832f, 11.161f, 8.961f)
            curveTo(10.178f, 9.331f, 9.283f, 9.574f, 8.379f, 9.543f)
            curveTo(7.669f, 9.519f, 6.913f, 9.324f, 6.077f, 8.823f)
            lineTo(11.131f, 3.932f)
            close()
            moveTo(11.264f, 20.631f)
            curveTo(11.439f, 20.862f, 11.69f, 20.985f, 11.946f, 21f)
            curveTo(11.982f, 21.002f, 12.018f, 21.002f, 12.054f, 21f)
            curveTo(12.31f, 20.985f, 12.561f, 20.862f, 12.736f, 20.631f)
            curveTo(13.624f, 19.46f, 15f, 17.465f, 15f, 16.343f)
            curveTo(15f, 14.686f, 13.657f, 13f, 12f, 13f)
            curveTo(10.343f, 13f, 9f, 14.686f, 9f, 16.343f)
            curveTo(9f, 17.465f, 10.376f, 19.46f, 11.264f, 20.631f)
            close()
            moveTo(13.5f, 16f)
            curveTo(13.5f, 16.828f, 12.828f, 17.5f, 12f, 17.5f)
            curveTo(11.172f, 17.5f, 10.5f, 16.828f, 10.5f, 16f)
            curveTo(10.5f, 15.172f, 11.172f, 14.5f, 12f, 14.5f)
            curveTo(12.828f, 14.5f, 13.5f, 15.172f, 13.5f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MountainLocationBottomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MountainLocationBottom, contentDescription = null)
    }
}
