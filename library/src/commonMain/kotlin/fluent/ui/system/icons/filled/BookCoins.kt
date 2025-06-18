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

public val FluentUi.Filled.BookCoins: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookCoins",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 4.5f)
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
            verticalLineTo(18.75f)
            curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
            horizontalLineTo(5.5f)
            curveTo(5.5f, 20.052f, 5.948f, 20.5f, 6.5f, 20.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 20.5f, 20.5f, 20.836f, 20.5f, 21.25f)
            curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
            verticalLineTo(4.5f)
            close()
            moveTo(10.197f, 7.464f)
            curveTo(9.622f, 7.739f, 9f, 8.241f, 9f, 9f)
            curveTo(9f, 9.759f, 9.622f, 10.261f, 10.197f, 10.536f)
            curveTo(10.819f, 10.833f, 11.634f, 11f, 12.5f, 11f)
            curveTo(13.366f, 11f, 14.181f, 10.833f, 14.803f, 10.536f)
            curveTo(15.378f, 10.261f, 16f, 9.759f, 16f, 9f)
            curveTo(16f, 8.241f, 15.378f, 7.739f, 14.803f, 7.464f)
            curveTo(14.181f, 7.167f, 13.366f, 7f, 12.5f, 7f)
            curveTo(11.634f, 7f, 10.819f, 7.167f, 10.197f, 7.464f)
            close()
            moveTo(15.995f, 10.89f)
            curveTo(15.17f, 11.567f, 13.911f, 12f, 12.5f, 12f)
            curveTo(11.089f, 12f, 9.83f, 11.567f, 9.005f, 10.89f)
            curveTo(9.002f, 10.927f, 9f, 10.963f, 9f, 11f)
            curveTo(9f, 12.105f, 10.567f, 13f, 12.5f, 13f)
            curveTo(14.433f, 13f, 16f, 12.105f, 16f, 11f)
            curveTo(16f, 10.963f, 15.998f, 10.927f, 15.995f, 10.89f)
            close()
            moveTo(12.5f, 14f)
            curveTo(11.089f, 14f, 9.83f, 13.567f, 9.005f, 12.89f)
            curveTo(9.002f, 12.927f, 9f, 12.963f, 9f, 13f)
            curveTo(9f, 14.105f, 10.567f, 15f, 12.5f, 15f)
            curveTo(14.433f, 15f, 16f, 14.105f, 16f, 13f)
            curveTo(16f, 12.963f, 15.998f, 12.927f, 15.995f, 12.89f)
            curveTo(15.17f, 13.567f, 13.911f, 14f, 12.5f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookCoinsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BookCoins, contentDescription = null)
    }
}
