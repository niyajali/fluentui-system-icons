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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Remote icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: remote
 * - Source: ic_fluent_remote_20_filled.svg
 * 
 * @return The [ImageVector] for the Remote icon.
 */
public val FluentIcons.Filled.Remote: ImageVector
    get() {
        if (_remote != null) {
            return _remote!!
        }
        _remote = Builder(name = "Remote", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.97f, 15.03f)
                curveTo(17.263f, 15.323f, 17.737f, 15.323f, 18.03f, 15.03f)
                curveTo(18.323f, 14.737f, 18.323f, 14.263f, 18.03f, 13.97f)
                lineTo(12.561f, 8.5f)
                lineTo(18.03f, 3.03f)
                curveTo(18.323f, 2.737f, 18.323f, 2.263f, 18.03f, 1.97f)
                curveTo(17.737f, 1.677f, 17.263f, 1.677f, 16.97f, 1.97f)
                lineTo(10.97f, 7.97f)
                curveTo(10.677f, 8.263f, 10.677f, 8.737f, 10.97f, 9.03f)
                lineTo(16.97f, 15.03f)
                close()
                moveTo(3.03f, 4.97f)
                curveTo(2.737f, 4.677f, 2.263f, 4.677f, 1.97f, 4.97f)
                curveTo(1.677f, 5.263f, 1.677f, 5.737f, 1.97f, 6.03f)
                lineTo(7.439f, 11.5f)
                lineTo(1.97f, 16.97f)
                curveTo(1.677f, 17.263f, 1.677f, 17.737f, 1.97f, 18.03f)
                curveTo(2.263f, 18.323f, 2.737f, 18.323f, 3.03f, 18.03f)
                lineTo(9.03f, 12.03f)
                curveTo(9.323f, 11.737f, 9.323f, 11.263f, 9.03f, 10.97f)
                lineTo(3.03f, 4.97f)
                close()
            }
        }
        .build()
        return _remote!!
    }

@Suppress("ObjectPropertyName")
private var _remote: ImageVector? = null

@Preview
@Composable
private fun RemotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Remote, contentDescription = null)
    }
}

