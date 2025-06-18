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

public val FluentIcons.Regular.ApprovalsApp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ApprovalsApp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.78f, 1.72f)
            curveTo(11.487f, 1.427f, 11.012f, 1.427f, 10.72f, 1.72f)
            curveTo(10.427f, 2.013f, 10.427f, 2.487f, 10.72f, 2.78f)
            lineTo(11.94f, 4f)
            curveTo(6.997f, 4.033f, 3f, 8.05f, 3f, 13f)
            curveTo(3f, 17.971f, 7.029f, 22f, 12f, 22f)
            curveTo(16.694f, 22f, 20.548f, 18.407f, 20.963f, 13.82f)
            curveTo(21f, 13.408f, 20.696f, 13.043f, 20.284f, 13.006f)
            curveTo(19.871f, 12.968f, 19.507f, 13.273f, 19.469f, 13.685f)
            curveTo(19.124f, 17.506f, 15.911f, 20.5f, 12f, 20.5f)
            curveTo(7.858f, 20.5f, 4.5f, 17.142f, 4.5f, 13f)
            curveTo(4.5f, 8.878f, 7.825f, 5.533f, 11.939f, 5.5f)
            lineTo(10.72f, 6.72f)
            curveTo(10.427f, 7.012f, 10.427f, 7.487f, 10.72f, 7.78f)
            curveTo(11.013f, 8.073f, 11.487f, 8.073f, 11.78f, 7.78f)
            lineTo(14.28f, 5.28f)
            curveTo(14.421f, 5.14f, 14.5f, 4.949f, 14.5f, 4.75f)
            curveTo(14.5f, 4.551f, 14.421f, 4.36f, 14.28f, 4.22f)
            lineTo(11.78f, 1.72f)
            close()
            moveTo(15.784f, 10.22f)
            curveTo(16.077f, 10.513f, 16.077f, 10.987f, 15.784f, 11.28f)
            lineTo(11.28f, 15.784f)
            curveTo(11.14f, 15.924f, 10.949f, 16.003f, 10.75f, 16.003f)
            curveTo(10.551f, 16.003f, 10.36f, 15.924f, 10.22f, 15.784f)
            lineTo(8.22f, 13.784f)
            curveTo(7.927f, 13.491f, 7.927f, 13.016f, 8.22f, 12.723f)
            curveTo(8.513f, 12.43f, 8.987f, 12.43f, 9.28f, 12.723f)
            lineTo(10.75f, 14.193f)
            lineTo(14.723f, 10.22f)
            curveTo(15.016f, 9.927f, 15.491f, 9.927f, 15.784f, 10.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ApprovalsAppPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ApprovalsApp, contentDescription = null)
    }
}
