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

public val FluentIcons.Filled.DocumentPageNumber: ImageVector
    get() {
        if (_DocumentPageNumber != null) {
            return _DocumentPageNumber!!
        }
        _DocumentPageNumber = ImageVector.Builder(
            name = "Filled.DocumentPageNumber",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.256f, 12.999f)
                lineTo(11.494f, 11.499f)
                horizontalLineTo(12.975f)
                lineTo(12.738f, 12.999f)
                horizontalLineTo(11.256f)
                close()
                moveTo(17.75f, 2f)
                curveTo(18.941f, 2f, 19.916f, 2.925f, 19.995f, 4.096f)
                lineTo(20f, 4.25f)
                verticalLineTo(19.748f)
                curveTo(20f, 20.939f, 19.075f, 21.914f, 17.904f, 21.993f)
                lineTo(17.75f, 21.998f)
                horizontalLineTo(6.25f)
                curveTo(5.059f, 21.998f, 4.084f, 21.073f, 4.005f, 19.902f)
                lineTo(4f, 19.748f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.059f, 4.925f, 2.084f, 6.096f, 2.005f)
                lineTo(6.25f, 2f)
                horizontalLineTo(17.75f)
                close()
                moveTo(12.395f, 15.16f)
                curveTo(12.331f, 15.569f, 12.61f, 15.953f, 13.019f, 16.018f)
                curveTo(13.428f, 16.083f, 13.812f, 15.804f, 13.877f, 15.394f)
                lineTo(14.019f, 14.499f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 14.499f, 15.5f, 14.163f, 15.5f, 13.749f)
                curveTo(15.5f, 13.335f, 15.164f, 12.999f, 14.75f, 12.999f)
                horizontalLineTo(14.256f)
                lineTo(14.494f, 11.499f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 11.499f, 16f, 11.163f, 16f, 10.749f)
                curveTo(16f, 10.335f, 15.664f, 9.999f, 15.25f, 9.999f)
                horizontalLineTo(14.731f)
                lineTo(14.893f, 8.974f)
                curveTo(14.958f, 8.565f, 14.679f, 8.181f, 14.27f, 8.116f)
                curveTo(13.861f, 8.052f, 13.477f, 8.331f, 13.412f, 8.74f)
                lineTo(13.212f, 9.999f)
                horizontalLineTo(11.731f)
                lineTo(11.893f, 8.974f)
                curveTo(11.958f, 8.565f, 11.679f, 8.181f, 11.27f, 8.116f)
                curveTo(10.861f, 8.052f, 10.477f, 8.331f, 10.412f, 8.74f)
                lineTo(10.212f, 9.999f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 9.999f, 8.5f, 10.335f, 8.5f, 10.749f)
                curveTo(8.5f, 11.163f, 8.836f, 11.499f, 9.25f, 11.499f)
                horizontalLineTo(9.975f)
                lineTo(9.738f, 12.999f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 12.999f, 8f, 13.335f, 8f, 13.749f)
                curveTo(8f, 14.163f, 8.336f, 14.499f, 8.75f, 14.499f)
                horizontalLineTo(9.5f)
                lineTo(9.395f, 15.16f)
                curveTo(9.331f, 15.569f, 9.61f, 15.953f, 10.019f, 16.018f)
                curveTo(10.428f, 16.083f, 10.812f, 15.804f, 10.877f, 15.394f)
                lineTo(11.019f, 14.499f)
                horizontalLineTo(12.5f)
                lineTo(12.395f, 15.16f)
                close()
            }
        }.build()

        return _DocumentPageNumber!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentPageNumber: ImageVector? = null

@Preview
@Composable
private fun DocumentPageNumberPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentPageNumber, contentDescription = null)
    }
}
