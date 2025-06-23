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

public val FluentIcons.Filled.DeveloperBoardSearch: ImageVector
    get() {
        if (_DeveloperBoardSearch != null) {
            return _DeveloperBoardSearch!!
        }
        _DeveloperBoardSearch = ImageVector.Builder(
            name = "Filled.DeveloperBoardSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.993f, 1.648f)
                curveTo(16.944f, 1.282f, 16.63f, 1f, 16.25f, 1f)
                lineTo(16.148f, 1.007f)
                lineTo(16.051f, 1.027f)
                curveTo(15.733f, 1.114f, 15.5f, 1.405f, 15.5f, 1.75f)
                verticalLineTo(3.999f)
                horizontalLineTo(13.749f)
                lineTo(13.75f, 1.75f)
                lineTo(13.743f, 1.648f)
                curveTo(13.693f, 1.282f, 13.38f, 1f, 13f, 1f)
                lineTo(12.898f, 1.007f)
                curveTo(12.532f, 1.057f, 12.25f, 1.37f, 12.25f, 1.75f)
                lineTo(12.249f, 3.999f)
                horizontalLineTo(10.5f)
                verticalLineTo(1.75f)
                lineTo(10.493f, 1.648f)
                curveTo(10.443f, 1.282f, 10.13f, 1f, 9.75f, 1f)
                curveTo(9.336f, 1f, 9f, 1.336f, 9f, 1.75f)
                lineTo(9f, 4.075f)
                curveTo(7.531f, 4.373f, 6.374f, 5.53f, 6.075f, 6.999f)
                lineTo(3.75f, 7f)
                lineTo(3.648f, 7.007f)
                curveTo(3.282f, 7.057f, 3f, 7.37f, 3f, 7.75f)
                lineTo(3.007f, 7.852f)
                curveTo(3.057f, 8.218f, 3.37f, 8.5f, 3.75f, 8.5f)
                lineTo(6f, 8.499f)
                verticalLineTo(10.249f)
                lineTo(3.75f, 10.25f)
                lineTo(3.648f, 10.257f)
                curveTo(3.282f, 10.307f, 3f, 10.62f, 3f, 11f)
                lineTo(3.007f, 11.102f)
                curveTo(3.028f, 11.256f, 3.095f, 11.395f, 3.195f, 11.505f)
                curveTo(3.896f, 11.181f, 4.677f, 11f, 5.5f, 11f)
                curveTo(8.538f, 11f, 11f, 13.462f, 11f, 16.5f)
                curveTo(11f, 17.02f, 10.928f, 17.522f, 10.793f, 17.999f)
                horizontalLineTo(12.249f)
                lineTo(12.25f, 20.25f)
                lineTo(12.257f, 20.352f)
                curveTo(12.307f, 20.718f, 12.62f, 21f, 13f, 21f)
                lineTo(13.102f, 20.993f)
                curveTo(13.468f, 20.944f, 13.75f, 20.63f, 13.75f, 20.25f)
                lineTo(13.749f, 17.999f)
                horizontalLineTo(15.5f)
                verticalLineTo(20.25f)
                lineTo(15.507f, 20.352f)
                curveTo(15.557f, 20.718f, 15.87f, 21f, 16.25f, 21f)
                curveTo(16.664f, 21f, 17f, 20.664f, 17f, 20.25f)
                lineTo(17f, 17.925f)
                curveTo(18.468f, 17.627f, 19.624f, 16.472f, 19.924f, 15.005f)
                lineTo(22.25f, 15.005f)
                lineTo(22.352f, 14.998f)
                curveTo(22.718f, 14.948f, 23f, 14.635f, 23f, 14.255f)
                lineTo(22.993f, 14.153f)
                curveTo(22.944f, 13.787f, 22.63f, 13.505f, 22.25f, 13.505f)
                lineTo(20f, 13.504f)
                verticalLineTo(11.754f)
                lineTo(22.25f, 11.755f)
                lineTo(22.352f, 11.748f)
                curveTo(22.718f, 11.698f, 23f, 11.385f, 23f, 11.005f)
                lineTo(22.993f, 10.903f)
                curveTo(22.944f, 10.537f, 22.63f, 10.255f, 22.25f, 10.255f)
                lineTo(20f, 10.254f)
                verticalLineTo(8.504f)
                lineTo(22.25f, 8.505f)
                lineTo(22.352f, 8.498f)
                curveTo(22.718f, 8.448f, 23f, 8.135f, 23f, 7.755f)
                curveTo(23f, 7.341f, 22.664f, 7.005f, 22.25f, 7.005f)
                lineTo(19.926f, 7.004f)
                curveTo(19.629f, 5.533f, 18.471f, 4.374f, 17f, 4.075f)
                lineTo(17f, 1.75f)
                lineTo(16.993f, 1.648f)
                close()
                moveTo(10.005f, 11.005f)
                curveTo(10.005f, 9.348f, 11.348f, 8.005f, 13.005f, 8.005f)
                curveTo(14.662f, 8.005f, 16.005f, 9.348f, 16.005f, 11.005f)
                curveTo(16.005f, 12.662f, 14.662f, 14.005f, 13.005f, 14.005f)
                curveTo(11.348f, 14.005f, 10.005f, 12.662f, 10.005f, 11.005f)
                close()
                moveTo(14.505f, 11.005f)
                curveTo(14.505f, 10.177f, 13.833f, 9.505f, 13.005f, 9.505f)
                curveTo(12.177f, 9.505f, 11.505f, 10.177f, 11.505f, 11.005f)
                curveTo(11.505f, 11.833f, 12.177f, 12.505f, 13.005f, 12.505f)
                curveTo(13.833f, 12.505f, 14.505f, 11.833f, 14.505f, 11.005f)
                close()
                moveTo(5.5f, 21f)
                curveTo(6.472f, 21f, 7.372f, 20.692f, 8.107f, 20.168f)
                lineTo(10.72f, 22.78f)
                curveTo(11.013f, 23.073f, 11.487f, 23.073f, 11.78f, 22.78f)
                curveTo(12.073f, 22.487f, 12.073f, 22.013f, 11.78f, 21.72f)
                lineTo(9.168f, 19.107f)
                curveTo(9.692f, 18.372f, 10f, 17.472f, 10f, 16.5f)
                curveTo(10f, 14.015f, 7.985f, 12f, 5.5f, 12f)
                curveTo(3.015f, 12f, 1f, 14.015f, 1f, 16.5f)
                curveTo(1f, 18.985f, 3.015f, 21f, 5.5f, 21f)
                close()
                moveTo(5.5f, 19.5f)
                curveTo(3.843f, 19.5f, 2.5f, 18.157f, 2.5f, 16.5f)
                curveTo(2.5f, 14.843f, 3.843f, 13.5f, 5.5f, 13.5f)
                curveTo(7.157f, 13.5f, 8.5f, 14.843f, 8.5f, 16.5f)
                curveTo(8.5f, 18.157f, 7.157f, 19.5f, 5.5f, 19.5f)
                close()
            }
        }.build()

        return _DeveloperBoardSearch!!
    }

@Suppress("ObjectPropertyName")
private var _DeveloperBoardSearch: ImageVector? = null

@Preview
@Composable
private fun DeveloperBoardSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DeveloperBoardSearch, contentDescription = null)
    }
}
