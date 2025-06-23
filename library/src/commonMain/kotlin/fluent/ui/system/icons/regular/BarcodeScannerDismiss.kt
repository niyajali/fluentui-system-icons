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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.BarcodeScannerDismiss: ImageVector
    get() {
        if (_BarcodeScannerDismiss != null) {
            return _BarcodeScannerDismiss!!
        }
        _BarcodeScannerDismiss = ImageVector.Builder(
            name = "Regular.BarcodeScannerDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 11f)
                curveTo(20.538f, 11f, 23f, 13.462f, 23f, 16.5f)
                curveTo(23f, 19.538f, 20.538f, 22f, 17.5f, 22f)
                curveTo(14.462f, 22f, 12f, 19.538f, 12f, 16.5f)
                curveTo(12f, 13.462f, 14.462f, 11f, 17.5f, 11f)
                close()
                moveTo(2.75f, 16f)
                curveTo(3.164f, 16f, 3.5f, 16.336f, 3.5f, 16.75f)
                verticalLineTo(18.25f)
                curveTo(3.5f, 18.94f, 4.06f, 19.5f, 4.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(6.664f, 19.5f, 7f, 19.836f, 7f, 20.25f)
                curveTo(7f, 20.664f, 6.664f, 21f, 6.25f, 21f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 21f, 2f, 19.769f, 2f, 18.25f)
                verticalLineTo(16.75f)
                curveTo(2f, 16.336f, 2.336f, 16f, 2.75f, 16f)
                close()
                moveTo(19.854f, 14.146f)
                curveTo(19.658f, 13.951f, 19.342f, 13.951f, 19.146f, 14.146f)
                lineTo(17.5f, 15.793f)
                lineTo(15.854f, 14.146f)
                curveTo(15.658f, 13.951f, 15.342f, 13.951f, 15.146f, 14.146f)
                curveTo(14.951f, 14.342f, 14.951f, 14.658f, 15.146f, 14.854f)
                lineTo(16.793f, 16.5f)
                lineTo(15.146f, 18.146f)
                curveTo(14.951f, 18.342f, 14.951f, 18.658f, 15.146f, 18.854f)
                curveTo(15.342f, 19.049f, 15.658f, 19.049f, 15.854f, 18.854f)
                lineTo(17.5f, 17.207f)
                lineTo(19.146f, 18.854f)
                curveTo(19.342f, 19.049f, 19.658f, 19.049f, 19.854f, 18.854f)
                curveTo(20.049f, 18.658f, 20.049f, 18.342f, 19.854f, 18.146f)
                lineTo(18.207f, 16.5f)
                lineTo(19.854f, 14.854f)
                curveTo(20.049f, 14.658f, 20.049f, 14.342f, 19.854f, 14.146f)
                close()
                moveTo(5.75f, 7f)
                curveTo(6.164f, 7f, 6.5f, 7.336f, 6.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(6.5f, 16.664f, 6.164f, 17f, 5.75f, 17f)
                curveTo(5.336f, 17f, 5f, 16.664f, 5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(5f, 7.336f, 5.336f, 7f, 5.75f, 7f)
                close()
                moveTo(9.75f, 7f)
                curveTo(10.164f, 7f, 10.5f, 7.336f, 10.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(10.5f, 16.664f, 10.164f, 17f, 9.75f, 17f)
                curveTo(9.336f, 17f, 9f, 16.664f, 9f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(9f, 7.336f, 9.336f, 7f, 9.75f, 7f)
                close()
                moveTo(13.75f, 7f)
                curveTo(14.164f, 7f, 14.5f, 7.336f, 14.5f, 7.75f)
                verticalLineTo(10.733f)
                curveTo(13.949f, 11.021f, 13.444f, 11.385f, 13f, 11.811f)
                verticalLineTo(7.75f)
                curveTo(13f, 7.336f, 13.336f, 7f, 13.75f, 7f)
                close()
                moveTo(17.75f, 7f)
                curveTo(18.164f, 7f, 18.5f, 7.336f, 18.5f, 7.75f)
                verticalLineTo(10.076f)
                curveTo(18.174f, 10.026f, 17.84f, 10f, 17.5f, 10f)
                curveTo(17.332f, 10f, 17.165f, 10.008f, 17f, 10.021f)
                verticalLineTo(7.75f)
                curveTo(17f, 7.336f, 17.336f, 7f, 17.75f, 7f)
                close()
                moveTo(6.25f, 3f)
                curveTo(6.664f, 3f, 7f, 3.336f, 7f, 3.75f)
                curveTo(7f, 4.164f, 6.664f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 4.5f, 3.5f, 5.06f, 3.5f, 5.75f)
                verticalLineTo(7.25f)
                curveTo(3.5f, 7.664f, 3.164f, 8f, 2.75f, 8f)
                curveTo(2.336f, 8f, 2f, 7.664f, 2f, 7.25f)
                verticalLineTo(5.75f)
                curveTo(2f, 4.231f, 3.231f, 3f, 4.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(19.25f, 3f)
                curveTo(20.769f, 3f, 22f, 4.231f, 22f, 5.75f)
                verticalLineTo(7.25f)
                curveTo(22f, 7.664f, 21.664f, 8f, 21.25f, 8f)
                curveTo(20.836f, 8f, 20.5f, 7.664f, 20.5f, 7.25f)
                verticalLineTo(5.75f)
                curveTo(20.5f, 5.06f, 19.94f, 4.5f, 19.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(17.336f, 4.5f, 17f, 4.164f, 17f, 3.75f)
                curveTo(17f, 3.336f, 17.336f, 3f, 17.75f, 3f)
                horizontalLineTo(19.25f)
                close()
            }
        }.build()

        return _BarcodeScannerDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _BarcodeScannerDismiss: ImageVector? = null

@Preview
@Composable
private fun BarcodeScannerDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BarcodeScannerDismiss, contentDescription = null)
    }
}
