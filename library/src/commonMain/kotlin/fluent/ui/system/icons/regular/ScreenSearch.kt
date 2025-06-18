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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ScreenSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ScreenSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.545f, 20.545f, 20f, 18.75f, 20f)
            horizontalLineTo(12.475f)
            lineTo(10.975f, 18.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 18.5f, 20.5f, 17.716f, 20.5f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(20.5f, 6.284f, 19.716f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 5.5f, 3.5f, 6.284f, 3.5f, 7.25f)
            verticalLineTo(10.375f)
            curveTo(2.952f, 10.589f, 2.446f, 10.889f, 2f, 11.257f)
            verticalLineTo(7.25f)
            close()
            moveTo(5.5f, 20f)
            curveTo(6.472f, 20f, 7.372f, 19.692f, 8.107f, 19.168f)
            lineTo(10.72f, 21.78f)
            curveTo(11.013f, 22.073f, 11.487f, 22.073f, 11.78f, 21.78f)
            curveTo(12.073f, 21.487f, 12.073f, 21.013f, 11.78f, 20.72f)
            lineTo(9.168f, 18.107f)
            curveTo(9.692f, 17.372f, 10f, 16.472f, 10f, 15.5f)
            curveTo(10f, 13.015f, 7.985f, 11f, 5.5f, 11f)
            curveTo(3.015f, 11f, 1f, 13.015f, 1f, 15.5f)
            curveTo(1f, 17.985f, 3.015f, 20f, 5.5f, 20f)
            close()
            moveTo(5.5f, 18.5f)
            curveTo(3.843f, 18.5f, 2.5f, 17.157f, 2.5f, 15.5f)
            curveTo(2.5f, 13.843f, 3.843f, 12.5f, 5.5f, 12.5f)
            curveTo(7.157f, 12.5f, 8.5f, 13.843f, 8.5f, 15.5f)
            curveTo(8.5f, 17.157f, 7.157f, 18.5f, 5.5f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScreenSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ScreenSearch, contentDescription = null)
    }
}
