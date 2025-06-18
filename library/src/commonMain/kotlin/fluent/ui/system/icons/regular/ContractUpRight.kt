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

public val FluentUi.Regular.ContractUpRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ContractUpRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(10.25f)
            curveTo(3f, 10.664f, 3.336f, 11f, 3.75f, 11f)
            curveTo(4.164f, 11f, 4.5f, 10.664f, 4.5f, 10.25f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(12f)
            verticalLineTo(9.75f)
            curveTo(12f, 10.993f, 13.007f, 12f, 14.25f, 12f)
            horizontalLineTo(19.5f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 19.5f, 13f, 19.836f, 13f, 20.25f)
            curveTo(13f, 20.664f, 13.336f, 21f, 13.75f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(13.5f, 9.75f)
            verticalLineTo(4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(10.5f)
            horizontalLineTo(14.25f)
            curveTo(13.836f, 10.5f, 13.5f, 10.164f, 13.5f, 9.75f)
            close()
            moveTo(3f, 13.75f)
            curveTo(3f, 14.164f, 3.336f, 14.5f, 3.75f, 14.5f)
            horizontalLineTo(8.439f)
            lineTo(3.22f, 19.72f)
            curveTo(2.927f, 20.013f, 2.927f, 20.487f, 3.22f, 20.78f)
            curveTo(3.513f, 21.073f, 3.987f, 21.073f, 4.28f, 20.78f)
            lineTo(9.5f, 15.561f)
            verticalLineTo(20.25f)
            curveTo(9.5f, 20.664f, 9.836f, 21f, 10.25f, 21f)
            curveTo(10.664f, 21f, 11f, 20.664f, 11f, 20.25f)
            verticalLineTo(13.75f)
            curveTo(11f, 13.336f, 10.664f, 13f, 10.25f, 13f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 13f, 3f, 13.336f, 3f, 13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ContractUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ContractUpRight, contentDescription = null)
    }
}
