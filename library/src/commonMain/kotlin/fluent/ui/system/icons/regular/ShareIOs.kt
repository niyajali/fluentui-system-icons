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
 * ShareIOs Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in sharing information scenarios, specifically for iOS.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_share_ios_24_regular.svg)
 * 
 * @return The [ImageVector] for the ShareIOs icon.
 */
public val FluentIcons.Regular.ShareIOs: ImageVector
    get() {
        if (_shareIOs != null) {
            return _shareIOs!!
        }
        _shareIOs = Builder(name = "ShareIOs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.53f, 2.22f)
                curveTo(12.237f, 1.927f, 11.763f, 1.927f, 11.47f, 2.22f)
                lineTo(6.22f, 7.47f)
                curveTo(5.927f, 7.763f, 5.927f, 8.237f, 6.22f, 8.53f)
                curveTo(6.513f, 8.823f, 6.987f, 8.823f, 7.28f, 8.53f)
                lineTo(11.25f, 4.561f)
                verticalLineTo(15.25f)
                curveTo(11.25f, 15.664f, 11.586f, 16.0f, 12.0f, 16.0f)
                curveTo(12.414f, 16.0f, 12.75f, 15.664f, 12.75f, 15.25f)
                verticalLineTo(4.561f)
                lineTo(16.72f, 8.53f)
                curveTo(17.013f, 8.823f, 17.487f, 8.823f, 17.78f, 8.53f)
                curveTo(18.073f, 8.237f, 18.073f, 7.763f, 17.78f, 7.47f)
                lineTo(12.53f, 2.22f)
                close()
                moveTo(3.75f, 11.0f)
                curveTo(4.164f, 11.0f, 4.5f, 11.336f, 4.5f, 11.75f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(11.75f)
                curveTo(19.5f, 11.336f, 19.836f, 11.0f, 20.25f, 11.0f)
                curveTo(20.664f, 11.0f, 21.0f, 11.336f, 21.0f, 11.75f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(11.75f)
                curveTo(3.0f, 11.336f, 3.336f, 11.0f, 3.75f, 11.0f)
                close()
            }
        }
        .build()
        return _shareIOs!!
    }

@Suppress("ObjectPropertyName")
private var _shareIOs: ImageVector? = null

@Preview
@Composable
private fun ShareIOsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShareIOs, contentDescription = "ShareIOs Icon")
    }
}

