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

public val FluentIcons.Regular.ChannelShare: ImageVector
    get() {
        if (_ChannelShare != null) {
            return _ChannelShare!!
        }
        _ChannelShare = ImageVector.Builder(
            name = "Regular.ChannelShare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(12.25f)
                curveTo(14.045f, 3f, 15.5f, 4.455f, 15.5f, 6.25f)
                curveTo(15.5f, 6.664f, 15.164f, 7f, 14.75f, 7f)
                curveTo(14.336f, 7f, 14f, 6.664f, 14f, 6.25f)
                curveTo(14f, 5.284f, 13.217f, 4.5f, 12.25f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(12.25f)
                curveTo(4.5f, 13.217f, 5.284f, 14f, 6.25f, 14f)
                horizontalLineTo(12.104f)
                curveTo(12.43f, 12.846f, 13.491f, 12f, 14.75f, 12f)
                curveTo(16.269f, 12f, 17.5f, 13.231f, 17.5f, 14.75f)
                curveTo(17.5f, 16.269f, 16.269f, 17.5f, 14.75f, 17.5f)
                curveTo(13.491f, 17.5f, 12.43f, 16.654f, 12.104f, 15.5f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 15.5f, 3f, 14.045f, 3f, 12.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(13.5f, 14.75f)
                curveTo(13.5f, 15.44f, 14.06f, 16f, 14.75f, 16f)
                curveTo(15.44f, 16f, 16f, 15.44f, 16f, 14.75f)
                curveTo(16f, 14.06f, 15.44f, 13.5f, 14.75f, 13.5f)
                curveTo(14.06f, 13.5f, 13.5f, 14.06f, 13.5f, 14.75f)
                close()
                moveTo(17.75f, 10f)
                curveTo(18.716f, 10f, 19.5f, 10.783f, 19.5f, 11.75f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(11.75f)
                curveTo(10.783f, 19.5f, 10f, 18.716f, 10f, 17.75f)
                curveTo(10f, 17.336f, 9.664f, 17f, 9.25f, 17f)
                curveTo(8.836f, 17f, 8.5f, 17.336f, 8.5f, 17.75f)
                curveTo(8.5f, 19.545f, 9.955f, 21f, 11.75f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(11.75f)
                curveTo(21f, 9.955f, 19.545f, 8.5f, 17.75f, 8.5f)
                horizontalLineTo(11.896f)
                curveTo(11.57f, 7.346f, 10.509f, 6.5f, 9.25f, 6.5f)
                curveTo(7.731f, 6.5f, 6.5f, 7.731f, 6.5f, 9.25f)
                curveTo(6.5f, 10.769f, 7.731f, 12f, 9.25f, 12f)
                curveTo(10.509f, 12f, 11.57f, 11.154f, 11.896f, 10f)
                horizontalLineTo(17.75f)
                close()
                moveTo(9.25f, 8f)
                curveTo(9.94f, 8f, 10.5f, 8.56f, 10.5f, 9.25f)
                curveTo(10.5f, 9.94f, 9.94f, 10.5f, 9.25f, 10.5f)
                curveTo(8.56f, 10.5f, 8f, 9.94f, 8f, 9.25f)
                curveTo(8f, 8.56f, 8.56f, 8f, 9.25f, 8f)
                close()
            }
        }.build()

        return _ChannelShare!!
    }

@Suppress("ObjectPropertyName")
private var _ChannelShare: ImageVector? = null

@Preview
@Composable
private fun ChannelSharePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChannelShare, contentDescription = null)
    }
}
