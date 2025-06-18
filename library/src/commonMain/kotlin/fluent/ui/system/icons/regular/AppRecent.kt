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

public val FluentUi.Regular.AppRecent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AppRecent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.75f, 2f)
            curveTo(16.941f, 2f, 17.916f, 2.925f, 17.995f, 4.096f)
            lineTo(18f, 4.25f)
            verticalLineTo(4.999f)
            lineTo(19.75f, 5f)
            curveTo(20.941f, 5f, 21.916f, 5.925f, 21.995f, 7.096f)
            lineTo(22f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(22f, 17.941f, 21.075f, 18.916f, 19.904f, 18.995f)
            lineTo(19.75f, 19f)
            lineTo(18f, 19f)
            verticalLineTo(19.75f)
            curveTo(18f, 20.941f, 17.075f, 21.916f, 15.904f, 21.995f)
            lineTo(15.75f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.059f, 22f, 6.084f, 21.075f, 6.005f, 19.904f)
            lineTo(6f, 19.75f)
            verticalLineTo(19f)
            lineTo(4.25f, 19f)
            curveTo(3.059f, 19f, 2.084f, 18.075f, 2.005f, 16.904f)
            lineTo(2f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(2f, 6.059f, 2.925f, 5.084f, 4.096f, 5.005f)
            lineTo(4.25f, 5f)
            lineTo(6f, 4.999f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.059f, 6.925f, 2.084f, 8.096f, 2.005f)
            lineTo(8.25f, 2f)
            horizontalLineTo(15.75f)
            close()
            moveTo(15.75f, 3.5f)
            horizontalLineTo(8.25f)
            curveTo(7.87f, 3.5f, 7.557f, 3.782f, 7.507f, 4.148f)
            lineTo(7.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(7.5f, 20.13f, 7.782f, 20.444f, 8.148f, 20.493f)
            lineTo(8.25f, 20.5f)
            horizontalLineTo(15.75f)
            curveTo(16.13f, 20.5f, 16.444f, 20.218f, 16.493f, 19.852f)
            lineTo(16.5f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(16.5f, 3.87f, 16.218f, 3.557f, 15.852f, 3.507f)
            lineTo(15.75f, 3.5f)
            close()
            moveTo(6f, 6.499f)
            lineTo(4.25f, 6.5f)
            curveTo(3.87f, 6.5f, 3.557f, 6.782f, 3.507f, 7.148f)
            lineTo(3.5f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(3.5f, 17.13f, 3.782f, 17.444f, 4.148f, 17.493f)
            lineTo(4.25f, 17.5f)
            horizontalLineTo(6f)
            verticalLineTo(6.499f)
            close()
            moveTo(19.75f, 6.5f)
            lineTo(18f, 6.499f)
            verticalLineTo(17.5f)
            horizontalLineTo(19.75f)
            curveTo(20.13f, 17.5f, 20.444f, 17.218f, 20.493f, 16.852f)
            lineTo(20.5f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(20.5f, 6.836f, 20.164f, 6.5f, 19.75f, 6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppRecentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AppRecent, contentDescription = null)
    }
}
