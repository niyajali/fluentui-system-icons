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

public val FluentIcons.Regular.Pivot: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pivot",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.25f)
            curveTo(18.216f, 4.5f, 19f, 5.284f, 19f, 6.25f)
            verticalLineTo(10.879f)
            curveTo(19.239f, 10.794f, 19.492f, 10.75f, 19.75f, 10.75f)
            curveTo(20.008f, 10.75f, 20.261f, 10.794f, 20.5f, 10.879f)
            verticalLineTo(6.25f)
            curveTo(20.5f, 4.455f, 19.045f, 3f, 17.25f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.25f)
            curveTo(3f, 19.045f, 4.455f, 20.5f, 6.25f, 20.5f)
            horizontalLineTo(10.879f)
            curveTo(10.794f, 20.261f, 10.75f, 20.008f, 10.75f, 19.75f)
            curveTo(10.75f, 19.492f, 10.794f, 19.239f, 10.879f, 19f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19f, 4.5f, 18.216f, 4.5f, 17.25f)
            verticalLineTo(6.25f)
            close()
            moveTo(6f, 7f)
            curveTo(6f, 6.448f, 6.448f, 6f, 7f, 6f)
            horizontalLineTo(9f)
            curveTo(9.552f, 6f, 10f, 6.448f, 10f, 7f)
            verticalLineTo(9f)
            curveTo(10f, 9.552f, 9.552f, 10f, 9f, 10f)
            horizontalLineTo(7f)
            curveTo(6.448f, 10f, 6f, 9.552f, 6f, 9f)
            verticalLineTo(7f)
            close()
            moveTo(11.5f, 7f)
            curveTo(11.5f, 6.448f, 11.948f, 6f, 12.5f, 6f)
            horizontalLineTo(16.5f)
            curveTo(17.052f, 6f, 17.5f, 6.448f, 17.5f, 7f)
            verticalLineTo(9f)
            curveTo(17.5f, 9.552f, 17.052f, 10f, 16.5f, 10f)
            horizontalLineTo(12.5f)
            curveTo(11.948f, 10f, 11.5f, 9.552f, 11.5f, 9f)
            verticalLineTo(7f)
            close()
            moveTo(6f, 12.5f)
            curveTo(6f, 11.948f, 6.448f, 11.5f, 7f, 11.5f)
            horizontalLineTo(9f)
            curveTo(9.552f, 11.5f, 10f, 11.948f, 10f, 12.5f)
            verticalLineTo(16.5f)
            curveTo(10f, 17.052f, 9.552f, 17.5f, 9f, 17.5f)
            horizontalLineTo(7f)
            curveTo(6.448f, 17.5f, 6f, 17.052f, 6f, 16.5f)
            verticalLineTo(12.5f)
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
        Image(imageVector = FluentIcons.Regular.Pivot, contentDescription = null)
    }
}
