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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.Xray: ImageVector
    get() {
        if (_Xray != null) {
            return _Xray!!
        }
        _Xray = ImageVector.Builder(
            name = "Filled.Xray",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 16.75f)
                curveTo(14f, 16.336f, 14.336f, 16f, 14.75f, 16f)
                curveTo(15.164f, 16f, 15.5f, 16.336f, 15.5f, 16.75f)
                curveTo(15.5f, 17.164f, 15.164f, 17.5f, 14.75f, 17.5f)
                curveTo(14.336f, 17.5f, 14f, 17.164f, 14f, 16.75f)
                close()
                moveTo(9.25f, 16f)
                curveTo(8.836f, 16f, 8.5f, 16.336f, 8.5f, 16.75f)
                curveTo(8.5f, 17.164f, 8.836f, 17.5f, 9.25f, 17.5f)
                curveTo(9.664f, 17.5f, 10f, 17.164f, 10f, 16.75f)
                curveTo(10f, 16.336f, 9.664f, 16f, 9.25f, 16f)
                close()
                moveTo(4f, 5.25f)
                curveTo(4f, 3.455f, 5.455f, 2f, 7.25f, 2f)
                horizontalLineTo(16.75f)
                curveTo(18.545f, 2f, 20f, 3.455f, 20f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(20f, 20.545f, 18.545f, 22f, 16.75f, 22f)
                horizontalLineTo(7.25f)
                curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(12.75f, 5.75f)
                curveTo(12.75f, 5.336f, 12.414f, 5f, 12f, 5f)
                curveTo(11.586f, 5f, 11.25f, 5.336f, 11.25f, 5.75f)
                verticalLineTo(6.5f)
                horizontalLineTo(9f)
                curveTo(8.586f, 6.5f, 8.25f, 6.836f, 8.25f, 7.25f)
                curveTo(8.25f, 7.664f, 8.586f, 8f, 9f, 8f)
                horizontalLineTo(11.25f)
                verticalLineTo(9f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 9f, 7f, 9.336f, 7f, 9.75f)
                curveTo(7f, 10.164f, 7.336f, 10.5f, 7.75f, 10.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 11.5f, 7f, 11.836f, 7f, 12.25f)
                curveTo(7f, 12.664f, 7.336f, 13f, 7.75f, 13f)
                horizontalLineTo(11.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.25f)
                curveTo(8.007f, 14.5f, 7f, 15.507f, 7f, 16.75f)
                curveTo(7f, 17.993f, 8.007f, 19f, 9.25f, 19f)
                curveTo(10.493f, 19f, 11.5f, 17.993f, 11.5f, 16.75f)
                curveTo(11.5f, 16.487f, 11.455f, 16.235f, 11.372f, 16f)
                horizontalLineTo(12.628f)
                curveTo(12.545f, 16.235f, 12.5f, 16.487f, 12.5f, 16.75f)
                curveTo(12.5f, 17.993f, 13.507f, 19f, 14.75f, 19f)
                curveTo(15.993f, 19f, 17f, 17.993f, 17f, 16.75f)
                curveTo(17f, 15.507f, 15.993f, 14.5f, 14.75f, 14.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(13f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 13f, 17f, 12.664f, 17f, 12.25f)
                curveTo(17f, 11.836f, 16.664f, 11.5f, 16.25f, 11.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 10.5f, 17f, 10.164f, 17f, 9.75f)
                curveTo(17f, 9.336f, 16.664f, 9f, 16.25f, 9f)
                horizontalLineTo(12.75f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                curveTo(15.414f, 8f, 15.75f, 7.664f, 15.75f, 7.25f)
                curveTo(15.75f, 6.836f, 15.414f, 6.5f, 15f, 6.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(5.75f)
                close()
            }
        }.build()

        return _Xray!!
    }

@Suppress("ObjectPropertyName")
private var _Xray: ImageVector? = null

@Preview
@Composable
private fun XrayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Xray, contentDescription = null)
    }
}
