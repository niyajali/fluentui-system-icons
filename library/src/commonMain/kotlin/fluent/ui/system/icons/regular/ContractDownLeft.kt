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

public val FluentUi.Regular.ContractDownLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ContractDownLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 6.25f)
            verticalLineTo(12f)
            horizontalLineTo(9.25f)
            curveTo(10.769f, 12f, 12f, 13.231f, 12f, 14.75f)
            verticalLineTo(19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(13.75f)
            curveTo(19.5f, 13.336f, 19.836f, 13f, 20.25f, 13f)
            curveTo(20.664f, 13f, 21f, 13.336f, 21f, 13.75f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 3f, 11f, 3.336f, 11f, 3.75f)
            curveTo(11f, 4.164f, 10.664f, 4.5f, 10.25f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            close()
            moveTo(4.5f, 13.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(10.5f)
            verticalLineTo(14.75f)
            curveTo(10.5f, 14.06f, 9.94f, 13.5f, 9.25f, 13.5f)
            horizontalLineTo(4.5f)
            close()
            moveTo(15.561f, 9.5f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 9.5f, 21f, 9.836f, 21f, 10.25f)
            curveTo(21f, 10.664f, 20.664f, 11f, 20.25f, 11f)
            horizontalLineTo(13.75f)
            curveTo(13.335f, 11f, 13f, 10.664f, 13f, 10.25f)
            verticalLineTo(3.75f)
            curveTo(13f, 3.336f, 13.335f, 3f, 13.75f, 3f)
            curveTo(14.164f, 3f, 14.5f, 3.336f, 14.5f, 3.75f)
            verticalLineTo(8.44f)
            lineTo(19.72f, 3.22f)
            curveTo(20.013f, 2.927f, 20.487f, 2.927f, 20.78f, 3.22f)
            curveTo(21.073f, 3.513f, 21.073f, 3.987f, 20.78f, 4.28f)
            lineTo(15.561f, 9.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ContractDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ContractDownLeft, contentDescription = null)
    }
}
