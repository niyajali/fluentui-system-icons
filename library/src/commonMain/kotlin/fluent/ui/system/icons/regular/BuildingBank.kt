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

public val FluentUi.Regular.BuildingBank: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BuildingBank",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 6.25f)
            curveTo(13f, 6.803f, 12.552f, 7.25f, 12f, 7.25f)
            curveTo(11.448f, 7.25f, 11f, 6.803f, 11f, 6.25f)
            curveTo(11f, 5.698f, 11.448f, 5.25f, 12f, 5.25f)
            curveTo(12.552f, 5.25f, 13f, 5.698f, 13f, 6.25f)
            close()
            moveTo(13.032f, 2.325f)
            curveTo(12.417f, 1.876f, 11.583f, 1.876f, 10.968f, 2.325f)
            lineTo(3.547f, 7.741f)
            curveTo(2.569f, 8.454f, 3.074f, 10f, 4.283f, 10f)
            horizontalLineTo(4.5f)
            lineTo(4.5f, 15.8f)
            curveTo(3.61f, 16.255f, 3f, 17.182f, 3f, 18.25f)
            verticalLineTo(19.75f)
            curveTo(3f, 20.164f, 3.336f, 20.5f, 3.75f, 20.5f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 20.5f, 21f, 20.164f, 21f, 19.75f)
            verticalLineTo(18.25f)
            curveTo(21f, 17.182f, 20.39f, 16.255f, 19.5f, 15.8f)
            verticalLineTo(10f)
            horizontalLineTo(19.717f)
            curveTo(20.926f, 10f, 21.431f, 8.454f, 20.453f, 7.741f)
            lineTo(13.032f, 2.325f)
            close()
            moveTo(11.853f, 3.536f)
            curveTo(11.94f, 3.472f, 12.06f, 3.472f, 12.147f, 3.536f)
            lineTo(18.95f, 8.5f)
            horizontalLineTo(5.05f)
            lineTo(11.853f, 3.536f)
            close()
            moveTo(18f, 10f)
            verticalLineTo(15.5f)
            horizontalLineTo(16f)
            verticalLineTo(10f)
            horizontalLineTo(18f)
            close()
            moveTo(14.5f, 10f)
            verticalLineTo(15.5f)
            horizontalLineTo(12.75f)
            verticalLineTo(10f)
            horizontalLineTo(14.5f)
            close()
            moveTo(11.25f, 10f)
            verticalLineTo(15.5f)
            horizontalLineTo(9.5f)
            lineTo(9.5f, 10f)
            horizontalLineTo(11.25f)
            close()
            moveTo(5.75f, 17f)
            horizontalLineTo(18.25f)
            curveTo(18.94f, 17f, 19.5f, 17.56f, 19.5f, 18.25f)
            verticalLineTo(19f)
            horizontalLineTo(4.5f)
            verticalLineTo(18.25f)
            curveTo(4.5f, 17.56f, 5.06f, 17f, 5.75f, 17f)
            close()
            moveTo(6f, 15.5f)
            lineTo(6f, 10f)
            horizontalLineTo(8f)
            lineTo(8f, 15.5f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingBankPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BuildingBank, contentDescription = null)
    }
}
