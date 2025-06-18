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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.Pivot: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pivot",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.5f)
            verticalLineTo(17f)
            curveTo(3f, 18.933f, 4.567f, 20.5f, 6.5f, 20.5f)
            horizontalLineTo(10.879f)
            curveTo(10.794f, 20.261f, 10.75f, 20.008f, 10.75f, 19.75f)
            curveTo(10.75f, 19.153f, 10.987f, 18.581f, 11.409f, 18.159f)
            lineTo(12.909f, 16.659f)
            curveTo(13.788f, 15.78f, 15.212f, 15.78f, 16.091f, 16.659f)
            curveTo(16.337f, 16.905f, 16.514f, 17.193f, 16.622f, 17.5f)
            horizontalLineTo(17.5f)
            verticalLineTo(16.622f)
            curveTo(17.193f, 16.514f, 16.905f, 16.337f, 16.659f, 16.091f)
            curveTo(15.78f, 15.212f, 15.78f, 13.788f, 16.659f, 12.909f)
            lineTo(18.159f, 11.409f)
            curveTo(18.581f, 10.987f, 19.153f, 10.75f, 19.75f, 10.75f)
            curveTo(20.008f, 10.75f, 20.261f, 10.794f, 20.5f, 10.879f)
            verticalLineTo(6.5f)
            curveTo(20.5f, 4.567f, 18.933f, 3f, 17f, 3f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 3f, 3f, 4.567f, 3f, 6.5f)
            close()
            moveTo(6.5f, 5f)
            horizontalLineTo(7.5f)
            curveTo(8.328f, 5f, 9f, 5.672f, 9f, 6.5f)
            verticalLineTo(7.5f)
            curveTo(9f, 8.328f, 8.328f, 9f, 7.5f, 9f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 9f, 5f, 8.328f, 5f, 7.5f)
            verticalLineTo(6.5f)
            curveTo(5f, 5.672f, 5.672f, 5f, 6.5f, 5f)
            close()
            moveTo(11f, 6.5f)
            curveTo(11f, 5.672f, 11.672f, 5f, 12.5f, 5f)
            horizontalLineTo(17f)
            curveTo(17.828f, 5f, 18.5f, 5.672f, 18.5f, 6.5f)
            verticalLineTo(7.5f)
            curveTo(18.5f, 8.328f, 17.828f, 9f, 17f, 9f)
            horizontalLineTo(12.5f)
            curveTo(11.672f, 9f, 11f, 8.328f, 11f, 7.5f)
            verticalLineTo(6.5f)
            close()
            moveTo(7.5f, 11f)
            curveTo(8.328f, 11f, 9f, 11.672f, 9f, 12.5f)
            verticalLineTo(17f)
            curveTo(9f, 17.828f, 8.328f, 18.5f, 7.5f, 18.5f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 18.5f, 5f, 17.828f, 5f, 17f)
            verticalLineTo(12.5f)
            curveTo(5f, 11.672f, 5.672f, 11f, 6.5f, 11f)
            horizontalLineTo(7.5f)
            close()
            moveTo(20.28f, 12.47f)
            curveTo(20.14f, 12.329f, 19.949f, 12.25f, 19.75f, 12.25f)
            curveTo(19.551f, 12.25f, 19.36f, 12.329f, 19.22f, 12.47f)
            lineTo(17.72f, 13.97f)
            curveTo(17.427f, 14.263f, 17.427f, 14.737f, 17.72f, 15.03f)
            curveTo(18.013f, 15.323f, 18.487f, 15.323f, 18.78f, 15.03f)
            lineTo(19f, 14.811f)
            verticalLineTo(17.25f)
            curveTo(19f, 18.216f, 18.216f, 19f, 17.25f, 19f)
            horizontalLineTo(14.811f)
            lineTo(15.03f, 18.78f)
            curveTo(15.323f, 18.487f, 15.323f, 18.013f, 15.03f, 17.72f)
            curveTo(14.737f, 17.427f, 14.263f, 17.427f, 13.97f, 17.72f)
            lineTo(12.47f, 19.22f)
            curveTo(12.329f, 19.36f, 12.25f, 19.551f, 12.25f, 19.75f)
            curveTo(12.25f, 19.949f, 12.329f, 20.14f, 12.47f, 20.28f)
            lineTo(13.97f, 21.78f)
            curveTo(14.263f, 22.073f, 14.737f, 22.073f, 15.03f, 21.78f)
            curveTo(15.323f, 21.487f, 15.323f, 21.013f, 15.03f, 20.72f)
            lineTo(14.811f, 20.5f)
            horizontalLineTo(17.25f)
            curveTo(19.045f, 20.5f, 20.5f, 19.045f, 20.5f, 17.25f)
            verticalLineTo(14.811f)
            lineTo(20.72f, 15.03f)
            curveTo(21.013f, 15.323f, 21.487f, 15.323f, 21.78f, 15.03f)
            curveTo(22.073f, 14.737f, 22.073f, 14.263f, 21.78f, 13.97f)
            lineTo(20.28f, 12.47f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PivotPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Pivot, contentDescription = null)
    }
}
