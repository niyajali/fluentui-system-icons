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

public val FluentIcons.Regular.ScanObject: ImageVector
    get() {
        if (_ScanObject != null) {
            return _ScanObject!!
        }
        _ScanObject = ImageVector.Builder(
            name = "Regular.ScanObject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 3.5f)
                curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
                verticalLineTo(8.25f)
                curveTo(3.5f, 8.664f, 3.164f, 9f, 2.75f, 9f)
                curveTo(2.336f, 9f, 2f, 8.664f, 2f, 8.25f)
                verticalLineTo(5.25f)
                curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 2f, 9f, 2.336f, 9f, 2.75f)
                curveTo(9f, 3.164f, 8.664f, 3.5f, 8.25f, 3.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(5.25f, 20.5f)
                curveTo(4.284f, 20.5f, 3.5f, 19.716f, 3.5f, 18.75f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 15.336f, 3.164f, 15f, 2.75f, 15f)
                curveTo(2.336f, 15f, 2f, 15.336f, 2f, 15.75f)
                verticalLineTo(18.75f)
                curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 22f, 9f, 21.664f, 9f, 21.25f)
                curveTo(9f, 20.836f, 8.664f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(20.5f, 5.25f)
                curveTo(20.5f, 4.284f, 19.716f, 3.5f, 18.75f, 3.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 3.5f, 15f, 3.164f, 15f, 2.75f)
                curveTo(15f, 2.336f, 15.336f, 2f, 15.75f, 2f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 2f, 22f, 3.455f, 22f, 5.25f)
                verticalLineTo(8.25f)
                curveTo(22f, 8.664f, 21.664f, 9f, 21.25f, 9f)
                curveTo(20.836f, 9f, 20.5f, 8.664f, 20.5f, 8.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(18.75f, 20.5f)
                curveTo(19.716f, 20.5f, 20.5f, 19.716f, 20.5f, 18.75f)
                verticalLineTo(15.75f)
                curveTo(20.5f, 15.336f, 20.836f, 15f, 21.25f, 15f)
                curveTo(21.664f, 15f, 22f, 15.336f, 22f, 15.75f)
                verticalLineTo(18.75f)
                curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 22f, 15f, 21.664f, 15f, 21.25f)
                curveTo(15f, 20.836f, 15.336f, 20.5f, 15.75f, 20.5f)
                horizontalLineTo(18.75f)
                close()
                moveTo(10.18f, 8.227f)
                curveTo(11.079f, 6.991f, 12.921f, 6.991f, 13.819f, 8.227f)
                lineTo(16.874f, 12.427f)
                curveTo(17.955f, 13.914f, 16.893f, 16f, 15.054f, 16f)
                horizontalLineTo(8.945f)
                curveTo(7.107f, 16f, 6.044f, 13.914f, 7.126f, 12.427f)
                lineTo(10.18f, 8.227f)
                close()
                moveTo(12.606f, 9.109f)
                curveTo(12.307f, 8.697f, 11.693f, 8.697f, 11.393f, 9.109f)
                lineTo(8.339f, 13.309f)
                curveTo(7.978f, 13.805f, 8.332f, 14.5f, 8.945f, 14.5f)
                horizontalLineTo(15.054f)
                curveTo(15.667f, 14.5f, 16.021f, 13.805f, 15.661f, 13.309f)
                lineTo(12.606f, 9.109f)
                close()
            }
        }.build()

        return _ScanObject!!
    }

@Suppress("ObjectPropertyName")
private var _ScanObject: ImageVector? = null

@Preview
@Composable
private fun ScanObjectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ScanObject, contentDescription = null)
    }
}
