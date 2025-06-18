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

public val FluentUi.Filled.DeveloperBoard: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeveloperBoard",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.25f, 2f)
            curveTo(15.63f, 2f, 15.943f, 2.282f, 15.993f, 2.648f)
            lineTo(16f, 2.75f)
            lineTo(16f, 5.075f)
            curveTo(17.471f, 5.374f, 18.629f, 6.533f, 18.926f, 8.004f)
            lineTo(21.25f, 8.005f)
            curveTo(21.664f, 8.005f, 22f, 8.341f, 22f, 8.755f)
            curveTo(22f, 9.135f, 21.718f, 9.448f, 21.352f, 9.498f)
            lineTo(21.25f, 9.505f)
            lineTo(19f, 9.504f)
            verticalLineTo(11.254f)
            lineTo(21.25f, 11.255f)
            curveTo(21.63f, 11.255f, 21.944f, 11.537f, 21.993f, 11.903f)
            lineTo(22f, 12.005f)
            curveTo(22f, 12.385f, 21.718f, 12.698f, 21.352f, 12.748f)
            lineTo(21.25f, 12.755f)
            lineTo(19f, 12.754f)
            verticalLineTo(14.504f)
            lineTo(21.25f, 14.505f)
            curveTo(21.63f, 14.505f, 21.944f, 14.787f, 21.993f, 15.153f)
            lineTo(22f, 15.255f)
            curveTo(22f, 15.635f, 21.718f, 15.948f, 21.352f, 15.998f)
            lineTo(21.25f, 16.005f)
            lineTo(18.924f, 16.005f)
            curveTo(18.624f, 17.472f, 17.468f, 18.627f, 16f, 18.925f)
            lineTo(16f, 21.25f)
            curveTo(16f, 21.664f, 15.664f, 22f, 15.25f, 22f)
            curveTo(14.87f, 22f, 14.557f, 21.718f, 14.507f, 21.352f)
            lineTo(14.5f, 21.25f)
            verticalLineTo(18.999f)
            horizontalLineTo(12.749f)
            lineTo(12.75f, 21.25f)
            curveTo(12.75f, 21.63f, 12.468f, 21.944f, 12.102f, 21.993f)
            lineTo(12f, 22f)
            curveTo(11.62f, 22f, 11.307f, 21.718f, 11.257f, 21.352f)
            lineTo(11.25f, 21.25f)
            lineTo(11.249f, 18.999f)
            horizontalLineTo(9.5f)
            verticalLineTo(21.25f)
            curveTo(9.5f, 21.63f, 9.218f, 21.944f, 8.852f, 21.993f)
            lineTo(8.75f, 22f)
            curveTo(8.37f, 22f, 8.057f, 21.718f, 8.007f, 21.352f)
            lineTo(8f, 21.25f)
            lineTo(8f, 18.925f)
            curveTo(6.531f, 18.627f, 5.373f, 17.469f, 5.075f, 16f)
            lineTo(2.75f, 16f)
            curveTo(2.336f, 16f, 2f, 15.664f, 2f, 15.25f)
            curveTo(2f, 14.87f, 2.282f, 14.557f, 2.648f, 14.507f)
            lineTo(2.75f, 14.5f)
            lineTo(5f, 14.499f)
            verticalLineTo(12.749f)
            lineTo(2.75f, 12.75f)
            curveTo(2.37f, 12.75f, 2.057f, 12.468f, 2.007f, 12.102f)
            lineTo(2f, 12f)
            curveTo(2f, 11.62f, 2.282f, 11.307f, 2.648f, 11.257f)
            lineTo(2.75f, 11.25f)
            lineTo(5f, 11.249f)
            verticalLineTo(9.499f)
            lineTo(2.75f, 9.5f)
            curveTo(2.37f, 9.5f, 2.057f, 9.218f, 2.007f, 8.852f)
            lineTo(2f, 8.75f)
            curveTo(2f, 8.37f, 2.282f, 8.057f, 2.648f, 8.007f)
            lineTo(2.75f, 8f)
            lineTo(5.075f, 7.999f)
            curveTo(5.374f, 6.53f, 6.531f, 5.373f, 8f, 5.075f)
            lineTo(8f, 2.75f)
            curveTo(8f, 2.336f, 8.336f, 2f, 8.75f, 2f)
            curveTo(9.13f, 2f, 9.443f, 2.282f, 9.493f, 2.648f)
            lineTo(9.5f, 2.75f)
            verticalLineTo(4.999f)
            horizontalLineTo(11.249f)
            lineTo(11.25f, 2.75f)
            curveTo(11.25f, 2.37f, 11.532f, 2.057f, 11.898f, 2.007f)
            lineTo(12f, 2f)
            curveTo(12.38f, 2f, 12.693f, 2.282f, 12.743f, 2.648f)
            lineTo(12.75f, 2.75f)
            lineTo(12.749f, 4.999f)
            horizontalLineTo(14.5f)
            verticalLineTo(2.75f)
            curveTo(14.5f, 2.405f, 14.733f, 2.114f, 15.051f, 2.027f)
            lineTo(15.148f, 2.007f)
            lineTo(15.25f, 2f)
            close()
            moveTo(12.005f, 9.005f)
            curveTo(10.348f, 9.005f, 9.005f, 10.348f, 9.005f, 12.005f)
            curveTo(9.005f, 13.662f, 10.348f, 15.005f, 12.005f, 15.005f)
            curveTo(13.662f, 15.005f, 15.005f, 13.662f, 15.005f, 12.005f)
            curveTo(15.005f, 10.348f, 13.662f, 9.005f, 12.005f, 9.005f)
            close()
            moveTo(12.005f, 10.505f)
            curveTo(12.833f, 10.505f, 13.505f, 11.177f, 13.505f, 12.005f)
            curveTo(13.505f, 12.833f, 12.833f, 13.505f, 12.005f, 13.505f)
            curveTo(11.177f, 13.505f, 10.505f, 12.833f, 10.505f, 12.005f)
            curveTo(10.505f, 11.177f, 11.177f, 10.505f, 12.005f, 10.505f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DeveloperBoardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DeveloperBoard, contentDescription = null)
    }
}
