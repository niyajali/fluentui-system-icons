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

public val FluentUi.Regular.LightbulbFilament: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LightbulbFilament",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.25f, 6.751f)
            curveTo(11.25f, 6.337f, 11.586f, 6.001f, 12f, 6.001f)
            curveTo(12.414f, 6.001f, 12.75f, 6.337f, 12.75f, 6.751f)
            verticalLineTo(8.251f)
            curveTo(12.75f, 8.665f, 12.414f, 9.001f, 12f, 9.001f)
            curveTo(11.586f, 9.001f, 11.25f, 8.665f, 11.25f, 8.251f)
            verticalLineTo(6.751f)
            close()
            moveTo(16.28f, 8.216f)
            curveTo(15.987f, 7.923f, 15.513f, 7.923f, 15.22f, 8.216f)
            lineTo(14.159f, 9.277f)
            curveTo(13.866f, 9.57f, 13.866f, 10.045f, 14.159f, 10.337f)
            curveTo(14.452f, 10.63f, 14.927f, 10.63f, 15.22f, 10.337f)
            lineTo(16.28f, 9.277f)
            curveTo(16.573f, 8.984f, 16.573f, 8.509f, 16.28f, 8.216f)
            close()
            moveTo(8.78f, 8.216f)
            curveTo(8.487f, 7.923f, 8.013f, 7.923f, 7.72f, 8.216f)
            curveTo(7.427f, 8.509f, 7.427f, 8.984f, 7.72f, 9.277f)
            lineTo(8.78f, 10.337f)
            curveTo(9.073f, 10.63f, 9.548f, 10.63f, 9.841f, 10.337f)
            curveTo(10.134f, 10.045f, 10.134f, 9.57f, 9.841f, 9.277f)
            lineTo(8.78f, 8.216f)
            close()
            moveTo(12f, 2.001f)
            curveTo(16.004f, 2.001f, 19.25f, 5.247f, 19.25f, 9.251f)
            curveTo(19.25f, 11.347f, 18.349f, 13.271f, 16.587f, 14.993f)
            curveTo(16.51f, 15.068f, 16.45f, 15.159f, 16.412f, 15.258f)
            lineTo(16.38f, 15.361f)
            lineTo(15.249f, 20.256f)
            curveTo(15.027f, 21.22f, 14.203f, 21.918f, 13.23f, 21.993f)
            lineTo(13.057f, 22f)
            horizontalLineTo(10.943f)
            curveTo(9.954f, 22f, 9.088f, 21.354f, 8.796f, 20.423f)
            lineTo(8.751f, 20.256f)
            lineTo(7.621f, 15.361f)
            curveTo(7.589f, 15.221f, 7.517f, 15.093f, 7.415f, 14.993f)
            curveTo(5.735f, 13.353f, 4.838f, 11.53f, 4.756f, 9.549f)
            lineTo(4.75f, 9.251f)
            lineTo(4.754f, 9.012f)
            curveTo(4.88f, 5.118f, 8.076f, 2.001f, 12f, 2.001f)
            close()
            moveTo(14.115f, 18.499f)
            horizontalLineTo(9.884f)
            lineTo(10.212f, 19.918f)
            curveTo(10.283f, 20.225f, 10.536f, 20.45f, 10.84f, 20.493f)
            lineTo(10.943f, 20.5f)
            horizontalLineTo(13.057f)
            curveTo(13.371f, 20.5f, 13.648f, 20.304f, 13.758f, 20.017f)
            lineTo(13.788f, 19.918f)
            lineTo(14.115f, 18.499f)
            close()
            moveTo(12f, 3.501f)
            curveTo(8.898f, 3.501f, 6.37f, 5.957f, 6.254f, 9.03f)
            lineTo(6.25f, 9.251f)
            lineTo(6.257f, 9.528f)
            curveTo(6.333f, 11.091f, 7.057f, 12.547f, 8.463f, 13.92f)
            curveTo(8.727f, 14.178f, 8.923f, 14.496f, 9.034f, 14.846f)
            lineTo(9.083f, 15.024f)
            lineTo(9.538f, 16.999f)
            horizontalLineTo(11.25f)
            verticalLineTo(10.75f)
            curveTo(11.25f, 10.336f, 11.586f, 10f, 12f, 10f)
            curveTo(12.414f, 10f, 12.75f, 10.336f, 12.75f, 10.75f)
            verticalLineTo(16.999f)
            horizontalLineTo(14.461f)
            lineTo(14.919f, 15.023f)
            curveTo(15.002f, 14.663f, 15.172f, 14.331f, 15.412f, 14.054f)
            lineTo(15.539f, 13.92f)
            curveTo(16.943f, 12.547f, 17.667f, 11.092f, 17.743f, 9.528f)
            lineTo(17.75f, 9.251f)
            lineTo(17.746f, 9.03f)
            curveTo(17.63f, 5.957f, 15.102f, 3.501f, 12f, 3.501f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LightbulbFilamentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.LightbulbFilament, contentDescription = null)
    }
}
