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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.EyeLines: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EyeLines",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.354f, 12.5f)
            curveTo(9.286f, 12.262f, 9.25f, 12.01f, 9.25f, 11.75f)
            curveTo(9.25f, 11.49f, 9.286f, 11.238f, 9.354f, 11f)
            horizontalLineTo(2.354f)
            curveTo(2.286f, 11.291f, 2.25f, 11.547f, 2.25f, 11.75f)
            curveTo(2.25f, 11.953f, 2.286f, 12.209f, 2.354f, 12.5f)
            horizontalLineTo(9.354f)
            close()
            moveTo(11.999f, 18.5f)
            horizontalLineTo(6.678f)
            curveTo(8.062f, 19.389f, 9.817f, 20f, 11.999f, 20f)
            horizontalLineTo(12.001f)
            curveTo(15.642f, 20f, 18.092f, 18.302f, 19.613f, 16.444f)
            curveTo(20.368f, 15.521f, 20.896f, 14.557f, 21.237f, 13.737f)
            curveTo(21.567f, 12.943f, 21.751f, 12.209f, 21.751f, 11.75f)
            curveTo(21.751f, 11.291f, 21.567f, 10.557f, 21.237f, 9.763f)
            curveTo(20.896f, 8.943f, 20.368f, 7.979f, 19.613f, 7.056f)
            curveTo(18.092f, 5.198f, 15.642f, 3.5f, 12.001f, 3.5f)
            horizontalLineTo(12f)
            curveTo(9.817f, 3.5f, 8.062f, 4.111f, 6.678f, 5f)
            horizontalLineTo(11.999f)
            horizontalLineTo(12.001f)
            curveTo(15.11f, 5f, 17.16f, 6.427f, 18.452f, 8.006f)
            curveTo(19.103f, 8.802f, 19.559f, 9.635f, 19.852f, 10.339f)
            curveTo(20.154f, 11.068f, 20.251f, 11.584f, 20.251f, 11.75f)
            curveTo(20.251f, 11.916f, 20.154f, 12.432f, 19.852f, 13.161f)
            curveTo(19.559f, 13.865f, 19.103f, 14.698f, 18.452f, 15.494f)
            curveTo(17.16f, 17.073f, 15.11f, 18.5f, 12.001f, 18.5f)
            horizontalLineTo(11.999f)
            close()
            moveTo(5.385f, 6f)
            curveTo(5.016f, 6.338f, 4.684f, 6.694f, 4.388f, 7.056f)
            curveTo(4.268f, 7.203f, 4.153f, 7.352f, 4.044f, 7.5f)
            horizontalLineTo(11.999f)
            verticalLineTo(6f)
            horizontalLineTo(5.385f)
            close()
            moveTo(11.999f, 8.5f)
            horizontalLineTo(3.391f)
            curveTo(3.136f, 8.941f, 2.928f, 9.368f, 2.764f, 9.763f)
            curveTo(2.731f, 9.843f, 2.7f, 9.922f, 2.67f, 10f)
            horizontalLineTo(9.879f)
            curveTo(10.383f, 9.389f, 11.146f, 9f, 12f, 9f)
            curveTo(13.519f, 9f, 14.75f, 10.231f, 14.75f, 11.75f)
            curveTo(14.75f, 13.269f, 13.519f, 14.5f, 12f, 14.5f)
            curveTo(11.146f, 14.5f, 10.383f, 14.111f, 9.879f, 13.5f)
            horizontalLineTo(2.67f)
            curveTo(2.7f, 13.578f, 2.731f, 13.657f, 2.764f, 13.737f)
            curveTo(2.928f, 14.132f, 3.136f, 14.559f, 3.391f, 15f)
            horizontalLineTo(11.999f)
            verticalLineTo(16f)
            curveTo(14.347f, 16f, 16.25f, 14.097f, 16.25f, 11.75f)
            curveTo(16.25f, 9.403f, 14.346f, 7.5f, 11.999f, 7.5f)
            verticalLineTo(8.5f)
            close()
            moveTo(11.999f, 16f)
            horizontalLineTo(4.044f)
            curveTo(4.153f, 16.148f, 4.268f, 16.297f, 4.388f, 16.444f)
            curveTo(4.684f, 16.806f, 5.016f, 17.162f, 5.385f, 17.5f)
            horizontalLineTo(11.999f)
            verticalLineTo(16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EyeLinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EyeLines, contentDescription = null)
    }
}
