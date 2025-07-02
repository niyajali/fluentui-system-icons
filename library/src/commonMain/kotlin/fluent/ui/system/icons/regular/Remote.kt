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
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: remote
 * - Source: ic_fluent_remote_20_regular.svg
 * 
 * @return The [ImageVector] for the Remote icon.
 */
public val FluentIcons.Regular.Remote: ImageVector
    get() {
        if (_remote != null) {
            return _remote!!
        }
        _remote = Builder(name = "Remote", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.146f, 14.854f)
                curveTo(17.342f, 15.049f, 17.658f, 15.049f, 17.854f, 14.854f)
                curveTo(18.049f, 14.658f, 18.049f, 14.342f, 17.854f, 14.146f)
                lineTo(12.207f, 8.5f)
                lineTo(17.854f, 2.854f)
                curveTo(18.049f, 2.658f, 18.049f, 2.342f, 17.854f, 2.146f)
                curveTo(17.658f, 1.951f, 17.342f, 1.951f, 17.146f, 2.146f)
                lineTo(11.146f, 8.146f)
                curveTo(10.951f, 8.342f, 10.951f, 8.658f, 11.146f, 8.854f)
                lineTo(17.146f, 14.854f)
                close()
                moveTo(2.854f, 5.146f)
                curveTo(2.658f, 4.951f, 2.342f, 4.951f, 2.146f, 5.146f)
                curveTo(1.951f, 5.342f, 1.951f, 5.658f, 2.146f, 5.854f)
                lineTo(7.793f, 11.5f)
                lineTo(2.146f, 17.146f)
                curveTo(1.951f, 17.342f, 1.951f, 17.658f, 2.146f, 17.854f)
                curveTo(2.342f, 18.049f, 2.658f, 18.049f, 2.854f, 17.854f)
                lineTo(8.854f, 11.854f)
                curveTo(9.049f, 11.658f, 9.049f, 11.342f, 8.854f, 11.146f)
                lineTo(2.854f, 5.146f)
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
        Image(imageVector = FluentIcons.Regular.Remote, contentDescription = null)
    }
}

