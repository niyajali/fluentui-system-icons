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

public val FluentUi.Filled.Likert: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Likert",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 4f)
            horizontalLineTo(5f)
            curveTo(3.343f, 4f, 2f, 5.343f, 2f, 7f)
            verticalLineTo(11.25f)
            horizontalLineTo(6f)
            verticalLineTo(4f)
            close()
            moveTo(2f, 12.75f)
            verticalLineTo(17f)
            curveTo(2f, 18.657f, 3.343f, 20f, 5f, 20f)
            horizontalLineTo(6f)
            verticalLineTo(12.75f)
            horizontalLineTo(2f)
            close()
            moveTo(7.5f, 20f)
            horizontalLineTo(19f)
            curveTo(20.657f, 20f, 22f, 18.657f, 22f, 17f)
            verticalLineTo(12.75f)
            horizontalLineTo(7.5f)
            verticalLineTo(20f)
            close()
            moveTo(11.25f, 16.25f)
            curveTo(11.25f, 16.802f, 10.802f, 17.25f, 10.25f, 17.25f)
            curveTo(9.698f, 17.25f, 9.25f, 16.802f, 9.25f, 16.25f)
            curveTo(9.25f, 15.698f, 9.698f, 15.25f, 10.25f, 15.25f)
            curveTo(10.802f, 15.25f, 11.25f, 15.698f, 11.25f, 16.25f)
            close()
            moveTo(14f, 16.25f)
            curveTo(14f, 16.802f, 13.552f, 17.25f, 13f, 17.25f)
            curveTo(12.448f, 17.25f, 12f, 16.802f, 12f, 16.25f)
            curveTo(12f, 15.698f, 12.448f, 15.25f, 13f, 15.25f)
            curveTo(13.552f, 15.25f, 14f, 15.698f, 14f, 16.25f)
            close()
            moveTo(17f, 16.25f)
            curveTo(17f, 16.802f, 16.552f, 17.25f, 16f, 17.25f)
            curveTo(15.448f, 17.25f, 15f, 16.802f, 15f, 16.25f)
            curveTo(15f, 15.698f, 15.448f, 15.25f, 16f, 15.25f)
            curveTo(16.552f, 15.25f, 17f, 15.698f, 17f, 16.25f)
            close()
            moveTo(20f, 16.25f)
            curveTo(20f, 16.802f, 19.552f, 17.25f, 19f, 17.25f)
            curveTo(18.448f, 17.25f, 18f, 16.802f, 18f, 16.25f)
            curveTo(18f, 15.698f, 18.448f, 15.25f, 19f, 15.25f)
            curveTo(19.552f, 15.25f, 20f, 15.698f, 20f, 16.25f)
            close()
            moveTo(22f, 11.25f)
            horizontalLineTo(7.5f)
            verticalLineTo(4f)
            horizontalLineTo(19f)
            curveTo(20.657f, 4f, 22f, 5.343f, 22f, 7f)
            verticalLineTo(11.25f)
            close()
            moveTo(10.25f, 8.75f)
            curveTo(10.802f, 8.75f, 11.25f, 8.302f, 11.25f, 7.75f)
            curveTo(11.25f, 7.198f, 10.802f, 6.75f, 10.25f, 6.75f)
            curveTo(9.698f, 6.75f, 9.25f, 7.198f, 9.25f, 7.75f)
            curveTo(9.25f, 8.302f, 9.698f, 8.75f, 10.25f, 8.75f)
            close()
            moveTo(14f, 7.75f)
            curveTo(14f, 7.198f, 13.552f, 6.75f, 13f, 6.75f)
            curveTo(12.448f, 6.75f, 12f, 7.198f, 12f, 7.75f)
            curveTo(12f, 8.302f, 12.448f, 8.75f, 13f, 8.75f)
            curveTo(13.552f, 8.75f, 14f, 8.302f, 14f, 7.75f)
            close()
            moveTo(17f, 7.75f)
            curveTo(17f, 7.198f, 16.552f, 6.75f, 16f, 6.75f)
            curveTo(15.448f, 6.75f, 15f, 7.198f, 15f, 7.75f)
            curveTo(15f, 8.302f, 15.448f, 8.75f, 16f, 8.75f)
            curveTo(16.552f, 8.75f, 17f, 8.302f, 17f, 7.75f)
            close()
            moveTo(20f, 7.75f)
            curveTo(20f, 7.198f, 19.552f, 6.75f, 19f, 6.75f)
            curveTo(18.448f, 6.75f, 18f, 7.198f, 18f, 7.75f)
            curveTo(18f, 8.302f, 18.448f, 8.75f, 19f, 8.75f)
            curveTo(19.552f, 8.75f, 20f, 8.302f, 20f, 7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LikertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Likert, contentDescription = null)
    }
}
