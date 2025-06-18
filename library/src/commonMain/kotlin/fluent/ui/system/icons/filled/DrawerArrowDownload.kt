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

public val FluentUi.Filled.DrawerArrowDownload: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DrawerArrowDownload",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 6.501f)
            curveTo(11f, 3.632f, 13.197f, 1.276f, 16f, 1.023f)
            verticalLineTo(6.794f)
            lineTo(14.354f, 5.147f)
            curveTo(14.158f, 4.952f, 13.842f, 4.952f, 13.646f, 5.147f)
            curveTo(13.451f, 5.343f, 13.451f, 5.659f, 13.646f, 5.855f)
            lineTo(16.146f, 8.355f)
            curveTo(16.342f, 8.55f, 16.658f, 8.55f, 16.854f, 8.355f)
            lineTo(19.354f, 5.855f)
            curveTo(19.549f, 5.659f, 19.549f, 5.343f, 19.354f, 5.147f)
            curveTo(19.158f, 4.952f, 18.842f, 4.952f, 18.646f, 5.147f)
            lineTo(17f, 6.794f)
            verticalLineTo(1.023f)
            curveTo(19.803f, 1.276f, 22f, 3.632f, 22f, 6.501f)
            curveTo(22f, 9.539f, 19.538f, 12.001f, 16.5f, 12.001f)
            curveTo(13.462f, 12.001f, 11f, 9.539f, 11f, 6.501f)
            close()
            moveTo(19.5f, 9.501f)
            curveTo(19.5f, 9.225f, 19.276f, 9.001f, 19f, 9.001f)
            horizontalLineTo(14f)
            curveTo(13.724f, 9.001f, 13.5f, 9.225f, 13.5f, 9.501f)
            curveTo(13.5f, 9.777f, 13.724f, 10.001f, 14f, 10.001f)
            horizontalLineTo(19f)
            curveTo(19.276f, 10.001f, 19.5f, 9.777f, 19.5f, 9.501f)
            close()
            moveTo(6.25f, 4.001f)
            horizontalLineTo(10.498f)
            curveTo(10.3f, 4.475f, 10.157f, 4.978f, 10.076f, 5.501f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 5.501f, 4.5f, 6.284f, 4.5f, 7.251f)
            verticalLineTo(8.001f)
            horizontalLineTo(10.174f)
            curveTo(10.299f, 8.529f, 10.488f, 9.032f, 10.732f, 9.501f)
            horizontalLineTo(4.5f)
            verticalLineTo(14.001f)
            horizontalLineTo(9.058f)
            curveTo(9.44f, 14.001f, 9.75f, 14.311f, 9.75f, 14.693f)
            verticalLineTo(14.751f)
            curveTo(9.75f, 15.994f, 10.757f, 17.001f, 12f, 17.001f)
            curveTo(13.243f, 17.001f, 14.25f, 15.994f, 14.25f, 14.751f)
            verticalLineTo(14.693f)
            curveTo(14.25f, 14.311f, 14.56f, 14.001f, 14.942f, 14.001f)
            horizontalLineTo(19.5f)
            verticalLineTo(12.269f)
            curveTo(20.051f, 11.982f, 20.556f, 11.618f, 21f, 11.191f)
            verticalLineTo(18.751f)
            curveTo(21f, 20.546f, 19.545f, 22.001f, 17.75f, 22.001f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 22.001f, 3f, 20.546f, 3f, 18.751f)
            verticalLineTo(7.251f)
            curveTo(3f, 5.456f, 4.455f, 4.001f, 6.25f, 4.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DrawerArrowDownloadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DrawerArrowDownload, contentDescription = null)
    }
}
