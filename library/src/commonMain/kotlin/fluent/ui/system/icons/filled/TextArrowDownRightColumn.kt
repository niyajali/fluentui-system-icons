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

public val FluentUi.Filled.TextArrowDownRightColumn: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.TextArrowDownRightColumn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.75f, 2f)
                curveTo(2.336f, 2f, 2f, 2.336f, 2f, 2.75f)
                curveTo(2f, 3.164f, 2.336f, 3.5f, 2.75f, 3.5f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 3.5f, 12f, 3.164f, 12f, 2.75f)
                curveTo(12f, 2.336f, 11.664f, 2f, 11.25f, 2f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 6f)
                curveTo(2.336f, 6f, 2f, 6.336f, 2f, 6.75f)
                curveTo(2f, 7.164f, 2.336f, 7.5f, 2.75f, 7.5f)
                horizontalLineTo(9.25f)
                curveTo(9.664f, 7.5f, 10f, 7.164f, 10f, 6.75f)
                curveTo(10f, 6.336f, 9.664f, 6f, 9.25f, 6f)
                horizontalLineTo(2.75f)
                close()
                moveTo(13f, 6.25f)
                curveTo(13f, 5.007f, 14.007f, 4f, 15.25f, 4f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 4f, 21f, 5.007f, 21f, 6.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(13f)
                verticalLineTo(6.25f)
                close()
                moveTo(13f, 11f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                close()
                moveTo(21f, 16.5f)
                horizontalLineTo(13f)
                verticalLineTo(19.75f)
                curveTo(13f, 20.993f, 14.007f, 22f, 15.25f, 22f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 22f, 21f, 20.993f, 21f, 19.75f)
                verticalLineTo(16.5f)
                close()
                moveTo(3.75f, 10f)
                curveTo(4.164f, 10f, 4.5f, 10.336f, 4.5f, 10.75f)
                verticalLineTo(13.75f)
                curveTo(4.5f, 14.44f, 5.06f, 15f, 5.75f, 15f)
                horizontalLineTo(8.439f)
                lineTo(7.22f, 13.78f)
                curveTo(6.927f, 13.487f, 6.927f, 13.013f, 7.22f, 12.72f)
                curveTo(7.513f, 12.427f, 7.987f, 12.427f, 8.28f, 12.72f)
                lineTo(10.78f, 15.22f)
                curveTo(11.073f, 15.513f, 11.073f, 15.987f, 10.78f, 16.28f)
                lineTo(8.28f, 18.78f)
                curveTo(7.987f, 19.073f, 7.513f, 19.073f, 7.22f, 18.78f)
                curveTo(6.927f, 18.487f, 6.927f, 18.013f, 7.22f, 17.72f)
                lineTo(8.439f, 16.5f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 16.5f, 3f, 15.269f, 3f, 13.75f)
                verticalLineTo(10.75f)
                curveTo(3f, 10.336f, 3.336f, 10f, 3.75f, 10f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TextArrowDownRightColumnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextArrowDownRightColumn, contentDescription = null)
    }
}
