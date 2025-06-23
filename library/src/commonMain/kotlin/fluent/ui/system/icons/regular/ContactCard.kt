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

public val FluentIcons.Regular.ContactCard: ImageVector
    get() {
        if (_ContactCard != null) {
            return _ContactCard!!
        }
        _ContactCard = ImageVector.Builder(
            name = "Regular.ContactCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.75f, 4f)
                curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(22f, 18.997f, 20.993f, 20.005f, 19.75f, 20.005f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.005f, 2f, 18.997f, 2f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
                horizontalLineTo(19.75f)
                close()
                moveTo(19.75f, 5.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(3.5f, 18.169f, 3.836f, 18.505f, 4.25f, 18.505f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 18.505f, 20.5f, 18.169f, 20.5f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 5.836f, 20.164f, 5.5f, 19.75f, 5.5f)
                close()
                moveTo(9.75f, 12.5f)
                curveTo(10.164f, 12.5f, 10.5f, 12.836f, 10.5f, 13.25f)
                verticalLineTo(13.743f)
                lineTo(10.492f, 13.851f)
                curveTo(10.329f, 14.964f, 9.398f, 15.501f, 8f, 15.501f)
                curveTo(6.602f, 15.501f, 5.67f, 14.964f, 5.508f, 13.85f)
                lineTo(5.5f, 13.742f)
                verticalLineTo(13.25f)
                curveTo(5.5f, 12.836f, 5.836f, 12.5f, 6.25f, 12.5f)
                horizontalLineTo(9.75f)
                close()
                moveTo(13.252f, 12.996f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 12.996f, 18.5f, 13.332f, 18.5f, 13.746f)
                curveTo(18.5f, 14.126f, 18.218f, 14.44f, 17.852f, 14.489f)
                lineTo(17.75f, 14.496f)
                horizontalLineTo(13.252f)
                curveTo(12.838f, 14.496f, 12.502f, 14.16f, 12.502f, 13.746f)
                curveTo(12.502f, 13.366f, 12.784f, 13.053f, 13.151f, 13.003f)
                lineTo(13.252f, 12.996f)
                horizontalLineTo(17.75f)
                horizontalLineTo(13.252f)
                close()
                moveTo(8f, 8.502f)
                curveTo(8.828f, 8.502f, 9.5f, 9.174f, 9.5f, 10.002f)
                curveTo(9.5f, 10.831f, 8.828f, 11.502f, 8f, 11.502f)
                curveTo(7.172f, 11.502f, 6.5f, 10.831f, 6.5f, 10.002f)
                curveTo(6.5f, 9.174f, 7.172f, 8.502f, 8f, 8.502f)
                close()
                moveTo(13.252f, 9.5f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 9.5f, 18.5f, 9.836f, 18.5f, 10.25f)
                curveTo(18.5f, 10.63f, 18.218f, 10.943f, 17.852f, 10.993f)
                lineTo(17.75f, 11f)
                horizontalLineTo(13.252f)
                curveTo(12.838f, 11f, 12.502f, 10.664f, 12.502f, 10.25f)
                curveTo(12.502f, 9.87f, 12.784f, 9.557f, 13.151f, 9.507f)
                lineTo(13.252f, 9.5f)
                horizontalLineTo(17.75f)
                horizontalLineTo(13.252f)
                close()
            }
        }.build()

        return _ContactCard!!
    }

@Suppress("ObjectPropertyName")
private var _ContactCard: ImageVector? = null

@Preview
@Composable
private fun ContactCardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ContactCard, contentDescription = null)
    }
}
