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

public val FluentIcons.Filled.GanttChart: ImageVector
    get() {
        if (_GanttChart != null) {
            return _GanttChart!!
        }
        _GanttChart = ImageVector.Builder(
            name = "Filled.GanttChart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                horizontalLineTo(8.25f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                curveTo(4.895f, 7f, 4f, 7.895f, 4f, 9f)
                curveTo(4f, 10.105f, 4.895f, 11f, 6f, 11f)
                horizontalLineTo(8.25f)
                verticalLineTo(20f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(9.25f, 20f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                curveTo(10f, 13.105f, 10.895f, 14f, 12f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                curveTo(13f, 16.02f, 13.763f, 16.861f, 14.75f, 16.985f)
                verticalLineTo(20f)
                horizontalLineTo(9.25f)
                close()
                moveTo(12f, 10f)
                horizontalLineTo(14.75f)
                verticalLineTo(4f)
                horizontalLineTo(9.25f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                curveTo(11.105f, 7f, 12f, 7.895f, 12f, 9f)
                verticalLineTo(10f)
                close()
                moveTo(18f, 17f)
                horizontalLineTo(15.75f)
                verticalLineTo(20f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
                horizontalLineTo(15.75f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                curveTo(17.105f, 10f, 18f, 10.895f, 18f, 12f)
                verticalLineTo(13f)
                curveTo(19.105f, 13f, 20f, 13.895f, 20f, 15f)
                curveTo(20f, 16.105f, 19.105f, 17f, 18f, 17f)
                close()
                moveTo(6f, 8f)
                curveTo(5.448f, 8f, 5f, 8.448f, 5f, 9f)
                curveTo(5f, 9.552f, 5.448f, 10f, 6f, 10f)
                horizontalLineTo(10f)
                curveTo(10.552f, 10f, 11f, 9.552f, 11f, 9f)
                curveTo(11f, 8.448f, 10.552f, 8f, 10f, 8f)
                horizontalLineTo(6f)
                close()
                moveTo(11f, 12f)
                curveTo(11f, 11.448f, 11.448f, 11f, 12f, 11f)
                horizontalLineTo(16f)
                curveTo(16.552f, 11f, 17f, 11.448f, 17f, 12f)
                curveTo(17f, 12.552f, 16.552f, 13f, 16f, 13f)
                horizontalLineTo(12f)
                curveTo(11.448f, 13f, 11f, 12.552f, 11f, 12f)
                close()
                moveTo(15f, 14f)
                curveTo(14.448f, 14f, 14f, 14.448f, 14f, 15f)
                curveTo(14f, 15.552f, 14.448f, 16f, 15f, 16f)
                horizontalLineTo(18f)
                curveTo(18.552f, 16f, 19f, 15.552f, 19f, 15f)
                curveTo(19f, 14.448f, 18.552f, 14f, 18f, 14f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _GanttChart!!
    }

@Suppress("ObjectPropertyName")
private var _GanttChart: ImageVector? = null

@Preview
@Composable
private fun GanttChartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GanttChart, contentDescription = null)
    }
}
