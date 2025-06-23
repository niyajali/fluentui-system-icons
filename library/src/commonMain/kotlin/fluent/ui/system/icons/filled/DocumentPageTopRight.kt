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

public val FluentIcons.Filled.DocumentPageTopRight: ImageVector
    get() {
        if (_DocumentPageTopRight != null) {
            return _DocumentPageTopRight!!
        }
        _DocumentPageTopRight = ImageVector.Builder(
            name = "Filled.DocumentPageTopRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.256f, 8.999f)
                lineTo(13.494f, 7.499f)
                horizontalLineTo(14.975f)
                lineTo(14.738f, 8.999f)
                horizontalLineTo(13.256f)
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
                moveTo(14.395f, 11.16f)
                curveTo(14.331f, 11.569f, 14.61f, 11.953f, 15.019f, 12.018f)
                curveTo(15.428f, 12.083f, 15.812f, 11.804f, 15.877f, 11.394f)
                lineTo(16.019f, 10.499f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 10.499f, 17.5f, 10.163f, 17.5f, 9.749f)
                curveTo(17.5f, 9.335f, 17.164f, 8.999f, 16.75f, 8.999f)
                horizontalLineTo(16.256f)
                lineTo(16.494f, 7.499f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 7.499f, 18f, 7.163f, 18f, 6.749f)
                curveTo(18f, 6.335f, 17.664f, 5.999f, 17.25f, 5.999f)
                horizontalLineTo(16.731f)
                lineTo(16.893f, 4.974f)
                curveTo(16.958f, 4.565f, 16.679f, 4.181f, 16.27f, 4.116f)
                curveTo(15.861f, 4.052f, 15.477f, 4.331f, 15.412f, 4.74f)
                lineTo(15.212f, 5.999f)
                horizontalLineTo(13.731f)
                lineTo(13.893f, 4.974f)
                curveTo(13.958f, 4.565f, 13.679f, 4.181f, 13.27f, 4.116f)
                curveTo(12.861f, 4.052f, 12.477f, 4.331f, 12.412f, 4.74f)
                lineTo(12.212f, 5.999f)
                horizontalLineTo(11.25f)
                curveTo(10.836f, 5.999f, 10.5f, 6.335f, 10.5f, 6.749f)
                curveTo(10.5f, 7.163f, 10.836f, 7.499f, 11.25f, 7.499f)
                horizontalLineTo(11.975f)
                lineTo(11.738f, 8.999f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 8.999f, 10f, 9.335f, 10f, 9.749f)
                curveTo(10f, 10.163f, 10.336f, 10.499f, 10.75f, 10.499f)
                horizontalLineTo(11.5f)
                lineTo(11.395f, 11.16f)
                curveTo(11.331f, 11.569f, 11.61f, 11.953f, 12.019f, 12.018f)
                curveTo(12.428f, 12.083f, 12.812f, 11.804f, 12.877f, 11.394f)
                lineTo(13.019f, 10.499f)
                horizontalLineTo(14.5f)
                lineTo(14.395f, 11.16f)
                close()
            }
        }.build()

        return _DocumentPageTopRight!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentPageTopRight: ImageVector? = null

@Preview
@Composable
private fun DocumentPageTopRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentPageTopRight, contentDescription = null)
    }
}
