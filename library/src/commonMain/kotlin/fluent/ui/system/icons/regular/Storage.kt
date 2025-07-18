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

public val FluentIcons.Regular.Storage: ImageVector
    get() {
        if (_Storage != null) {
            return _Storage!!
        }
        _Storage = ImageVector.Builder(
            name = "Regular.Storage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5f, 7f)
                horizontalLineTo(19f)
                curveTo(20.598f, 7f, 21.904f, 8.249f, 21.995f, 9.824f)
                lineTo(22f, 10f)
                verticalLineTo(14f)
                curveTo(22f, 15.598f, 20.751f, 16.904f, 19.176f, 16.995f)
                lineTo(19f, 17f)
                horizontalLineTo(5f)
                curveTo(3.402f, 17f, 2.096f, 15.751f, 2.005f, 14.176f)
                lineTo(2f, 14f)
                verticalLineTo(10f)
                curveTo(2f, 8.402f, 3.249f, 7.096f, 4.824f, 7.005f)
                lineTo(5f, 7f)
                horizontalLineTo(19f)
                horizontalLineTo(5f)
                close()
                moveTo(19f, 8.5f)
                horizontalLineTo(5f)
                curveTo(4.172f, 8.5f, 3.5f, 9.172f, 3.5f, 10f)
                verticalLineTo(14f)
                curveTo(3.5f, 14.828f, 4.172f, 15.5f, 5f, 15.5f)
                horizontalLineTo(19f)
                curveTo(19.828f, 15.5f, 20.5f, 14.828f, 20.5f, 14f)
                verticalLineTo(10f)
                curveTo(20.5f, 9.172f, 19.828f, 8.5f, 19f, 8.5f)
                close()
                moveTo(18f, 10f)
                curveTo(18.552f, 10f, 19f, 10.448f, 19f, 11f)
                curveTo(19f, 11.552f, 18.552f, 12f, 18f, 12f)
                curveTo(17.448f, 12f, 17f, 11.552f, 17f, 11f)
                curveTo(17f, 10.448f, 17.448f, 10f, 18f, 10f)
                close()
                moveTo(14f, 10f)
                curveTo(14.552f, 10f, 15f, 10.448f, 15f, 11f)
                curveTo(15f, 11.552f, 14.552f, 12f, 14f, 12f)
                curveTo(13.448f, 12f, 13f, 11.552f, 13f, 11f)
                curveTo(13f, 10.448f, 13.448f, 10f, 14f, 10f)
                close()
            }
        }.build()

        return _Storage!!
    }

@Suppress("ObjectPropertyName")
private var _Storage: ImageVector? = null

@Preview
@Composable
private fun StoragePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Storage, contentDescription = null)
    }
}
