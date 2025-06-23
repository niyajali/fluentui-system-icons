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

public val FluentIcons.Regular.DataUsageToolbox: ImageVector
    get() {
        if (_DataUsageToolbox != null) {
            return _DataUsageToolbox!!
        }
        _DataUsageToolbox = ImageVector.Builder(
            name = "Regular.DataUsageToolbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.25f, 1.996f)
                curveTo(18.769f, 1.996f, 20f, 3.227f, 20f, 4.746f)
                verticalLineTo(11.353f)
                curveTo(19.762f, 11.285f, 19.51f, 11.249f, 19.25f, 11.249f)
                horizontalLineTo(18.5f)
                verticalLineTo(4.746f)
                curveTo(18.5f, 4.056f, 17.94f, 3.496f, 17.25f, 3.496f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 3.496f, 3.5f, 4.056f, 3.5f, 4.746f)
                verticalLineTo(17.246f)
                curveTo(3.5f, 17.936f, 4.06f, 18.496f, 4.75f, 18.496f)
                horizontalLineTo(11f)
                verticalLineTo(19.996f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 19.996f, 2f, 18.765f, 2f, 17.246f)
                verticalLineTo(4.746f)
                curveTo(2f, 3.227f, 3.231f, 1.996f, 4.75f, 1.996f)
                horizontalLineTo(17.25f)
                close()
                moveTo(16f, 6.729f)
                verticalLineTo(11.249f)
                horizontalLineTo(15.75f)
                curveTo(15.3f, 11.249f, 14.875f, 11.358f, 14.5f, 11.549f)
                verticalLineTo(6.729f)
                curveTo(14.5f, 6.326f, 14.836f, 5.999f, 15.25f, 5.999f)
                curveTo(15.63f, 5.999f, 15.943f, 6.274f, 15.993f, 6.63f)
                lineTo(16f, 6.729f)
                close()
                moveTo(11.715f, 11.715f)
                lineTo(11.745f, 14.719f)
                curveTo(11.399f, 15.06f, 11.152f, 15.501f, 11.051f, 15.995f)
                curveTo(11.042f, 15.996f, 11.034f, 15.996f, 11.025f, 15.996f)
                curveTo(10.654f, 16f, 10.345f, 15.729f, 10.293f, 15.375f)
                lineTo(10.285f, 15.277f)
                lineTo(10.25f, 11.73f)
                curveTo(10.246f, 11.328f, 10.571f, 11f, 10.975f, 10.996f)
                curveTo(11.346f, 10.993f, 11.655f, 11.263f, 11.707f, 11.617f)
                lineTo(11.715f, 11.715f)
                close()
                moveTo(6.75f, 7.999f)
                curveTo(7.13f, 7.999f, 7.443f, 8.28f, 7.493f, 8.645f)
                lineTo(7.5f, 8.746f)
                verticalLineTo(15.253f)
                curveTo(7.5f, 15.665f, 7.164f, 15.999f, 6.75f, 15.999f)
                curveTo(6.37f, 15.999f, 6.057f, 15.719f, 6.007f, 15.354f)
                lineTo(6f, 15.253f)
                verticalLineTo(8.746f)
                curveTo(6f, 8.334f, 6.336f, 7.999f, 6.75f, 7.999f)
                close()
                moveTo(14f, 14.999f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 14.999f, 12f, 15.671f, 12f, 16.499f)
                verticalLineTo(17.999f)
                horizontalLineTo(14.5f)
                verticalLineTo(17.749f)
                curveTo(14.5f, 17.335f, 14.836f, 16.999f, 15.25f, 16.999f)
                curveTo(15.664f, 16.999f, 16f, 17.335f, 16f, 17.749f)
                verticalLineTo(17.999f)
                horizontalLineTo(19f)
                verticalLineTo(17.749f)
                curveTo(19f, 17.335f, 19.336f, 16.999f, 19.75f, 16.999f)
                curveTo(20.164f, 16.999f, 20.5f, 17.335f, 20.5f, 17.749f)
                verticalLineTo(17.999f)
                horizontalLineTo(23f)
                verticalLineTo(16.499f)
                curveTo(23f, 15.671f, 22.328f, 14.999f, 21.5f, 14.999f)
                horizontalLineTo(21f)
                verticalLineTo(13.999f)
                curveTo(21f, 13.033f, 20.216f, 12.249f, 19.25f, 12.249f)
                horizontalLineTo(15.75f)
                curveTo(14.783f, 12.249f, 14f, 13.033f, 14f, 13.999f)
                verticalLineTo(14.999f)
                close()
                moveTo(15.5f, 13.999f)
                curveTo(15.5f, 13.861f, 15.612f, 13.749f, 15.75f, 13.749f)
                horizontalLineTo(19.25f)
                curveTo(19.388f, 13.749f, 19.5f, 13.861f, 19.5f, 13.999f)
                verticalLineTo(14.999f)
                horizontalLineTo(15.5f)
                verticalLineTo(13.999f)
                close()
                moveTo(12f, 21.499f)
                verticalLineTo(19.499f)
                horizontalLineTo(14.5f)
                verticalLineTo(20.249f)
                curveTo(14.5f, 20.664f, 14.836f, 20.999f, 15.25f, 20.999f)
                curveTo(15.664f, 20.999f, 16f, 20.664f, 16f, 20.249f)
                verticalLineTo(19.499f)
                horizontalLineTo(19f)
                verticalLineTo(20.249f)
                curveTo(19f, 20.664f, 19.336f, 20.999f, 19.75f, 20.999f)
                curveTo(20.164f, 20.999f, 20.5f, 20.664f, 20.5f, 20.249f)
                verticalLineTo(19.499f)
                horizontalLineTo(23f)
                verticalLineTo(21.499f)
                curveTo(23f, 22.328f, 22.328f, 22.999f, 21.5f, 22.999f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 22.999f, 12f, 22.328f, 12f, 21.499f)
                close()
            }
        }.build()

        return _DataUsageToolbox!!
    }

@Suppress("ObjectPropertyName")
private var _DataUsageToolbox: ImageVector? = null

@Preview
@Composable
private fun DataUsageToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DataUsageToolbox, contentDescription = null)
    }
}
