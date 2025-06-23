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

public val FluentIcons.Filled.BroadActivityFeed: ImageVector
    get() {
        if (_BroadActivityFeed != null) {
            return _BroadActivityFeed!!
        }
        _BroadActivityFeed = ImageVector.Builder(
            name = "Filled.BroadActivityFeed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.246f, 14.001f)
                curveTo(10.213f, 14.001f, 10.996f, 14.785f, 10.996f, 15.751f)
                verticalLineTo(19.251f)
                curveTo(10.996f, 20.218f, 10.213f, 21.001f, 9.246f, 21.001f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 21.001f, 2f, 20.218f, 2f, 19.251f)
                verticalLineTo(15.751f)
                curveTo(2f, 14.785f, 2.783f, 14.001f, 3.75f, 14.001f)
                horizontalLineTo(9.246f)
                close()
                moveTo(20.25f, 14.001f)
                curveTo(21.216f, 14.001f, 22f, 14.785f, 22f, 15.751f)
                verticalLineTo(19.251f)
                curveTo(22f, 20.218f, 21.216f, 21.001f, 20.25f, 21.001f)
                horizontalLineTo(14.754f)
                curveTo(13.787f, 21.001f, 13.004f, 20.218f, 13.004f, 19.251f)
                verticalLineTo(15.751f)
                curveTo(13.004f, 14.785f, 13.787f, 14.001f, 14.754f, 14.001f)
                horizontalLineTo(20.25f)
                close()
                moveTo(20.25f, 2.996f)
                curveTo(21.216f, 2.996f, 22f, 3.78f, 22f, 4.746f)
                verticalLineTo(10.25f)
                curveTo(22f, 11.216f, 21.216f, 12f, 20.25f, 12f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 12f, 2f, 11.216f, 2f, 10.25f)
                verticalLineTo(4.746f)
                curveTo(2f, 3.828f, 2.707f, 3.075f, 3.606f, 3.002f)
                lineTo(3.75f, 2.996f)
                horizontalLineTo(20.25f)
                close()
            }
        }.build()

        return _BroadActivityFeed!!
    }

@Suppress("ObjectPropertyName")
private var _BroadActivityFeed: ImageVector? = null

@Preview
@Composable
private fun BroadActivityFeedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BroadActivityFeed, contentDescription = null)
    }
}
