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

public val FluentUi.Regular.ReadingList: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ReadingList",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 18f)
            horizontalLineTo(20f)
            curveTo(20.414f, 18f, 20.75f, 18.336f, 20.75f, 18.75f)
            curveTo(20.75f, 19.13f, 20.468f, 19.444f, 20.102f, 19.493f)
            lineTo(20f, 19.5f)
            horizontalLineTo(7f)
            curveTo(6.586f, 19.5f, 6.25f, 19.164f, 6.25f, 18.75f)
            curveTo(6.25f, 18.37f, 6.532f, 18.056f, 6.898f, 18.007f)
            lineTo(7f, 18f)
            close()
            moveTo(17f, 15f)
            curveTo(17.414f, 15f, 17.75f, 15.336f, 17.75f, 15.75f)
            curveTo(17.75f, 16.13f, 17.468f, 16.444f, 17.102f, 16.493f)
            lineTo(17f, 16.5f)
            horizontalLineTo(4f)
            curveTo(3.586f, 16.5f, 3.25f, 16.164f, 3.25f, 15.75f)
            curveTo(3.25f, 15.37f, 3.532f, 15.057f, 3.898f, 15.007f)
            lineTo(4f, 15f)
            horizontalLineTo(17f)
            close()
            moveTo(20f, 12f)
            curveTo(20.414f, 12f, 20.75f, 12.336f, 20.75f, 12.75f)
            curveTo(20.75f, 13.13f, 20.468f, 13.443f, 20.102f, 13.493f)
            lineTo(20f, 13.5f)
            horizontalLineTo(7f)
            curveTo(6.586f, 13.5f, 6.25f, 13.164f, 6.25f, 12.75f)
            curveTo(6.25f, 12.37f, 6.532f, 12.057f, 6.898f, 12.007f)
            lineTo(7f, 12f)
            horizontalLineTo(20f)
            close()
            moveTo(6f, 5f)
            curveTo(7.13f, 5f, 8.132f, 5.688f, 8.549f, 6.717f)
            curveTo(8.705f, 7.101f, 8.52f, 7.538f, 8.136f, 7.694f)
            curveTo(7.784f, 7.836f, 7.387f, 7.693f, 7.204f, 7.372f)
            lineTo(7.159f, 7.281f)
            curveTo(6.969f, 6.813f, 6.514f, 6.5f, 6f, 6.5f)
            curveTo(5.31f, 6.5f, 4.75f, 7.06f, 4.75f, 7.75f)
            curveTo(4.75f, 8.44f, 5.31f, 9f, 6f, 9f)
            horizontalLineTo(17.5f)
            curveTo(17.914f, 9f, 18.25f, 9.336f, 18.25f, 9.75f)
            curveTo(18.25f, 10.13f, 17.968f, 10.443f, 17.602f, 10.493f)
            lineTo(17.5f, 10.5f)
            horizontalLineTo(6f)
            curveTo(4.481f, 10.5f, 3.25f, 9.269f, 3.25f, 7.75f)
            curveTo(3.25f, 6.231f, 4.481f, 5f, 6f, 5f)
            close()
            moveTo(20f, 6f)
            curveTo(20.414f, 6f, 20.75f, 6.336f, 20.75f, 6.75f)
            curveTo(20.75f, 7.13f, 20.468f, 7.443f, 20.102f, 7.493f)
            lineTo(20f, 7.5f)
            horizontalLineTo(11f)
            curveTo(10.586f, 7.5f, 10.25f, 7.164f, 10.25f, 6.75f)
            curveTo(10.25f, 6.37f, 10.532f, 6.057f, 10.898f, 6.007f)
            lineTo(11f, 6f)
            horizontalLineTo(20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReadingListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ReadingList, contentDescription = null)
    }
}
