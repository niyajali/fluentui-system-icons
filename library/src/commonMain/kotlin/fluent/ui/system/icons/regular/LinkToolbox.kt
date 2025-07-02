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
 * LinkToolbox icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: link, toolbox
 * - Source: ic_fluent_link_toolbox_20_regular.svg
 * 
 * @return The [ImageVector] for the LinkToolbox icon.
 */
public val FluentIcons.Regular.LinkToolbox: ImageVector
    get() {
        if (_linkToolbox != null) {
            return _linkToolbox!!
        }
        _linkToolbox = Builder(name = "LinkToolbox", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveTo(8.276f, 4.0f, 8.5f, 4.224f, 8.5f, 4.5f)
                curveTo(8.5f, 4.745f, 8.323f, 4.95f, 8.09f, 4.992f)
                lineTo(8.0f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 5.0f, 3.0f, 6.343f, 3.0f, 8.0f)
                curveTo(3.0f, 9.591f, 4.238f, 10.892f, 5.803f, 10.994f)
                lineTo(6.0f, 11.0f)
                horizontalLineTo(8.0f)
                curveTo(8.276f, 11.0f, 8.5f, 11.224f, 8.5f, 11.5f)
                curveTo(8.5f, 11.745f, 8.323f, 11.95f, 8.09f, 11.992f)
                lineTo(8.0f, 12.0f)
                horizontalLineTo(6.0f)
                curveTo(3.791f, 12.0f, 2.0f, 10.209f, 2.0f, 8.0f)
                curveTo(2.0f, 5.865f, 3.673f, 4.12f, 5.781f, 4.006f)
                lineTo(6.0f, 4.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(14.0f, 4.0f)
                curveTo(16.209f, 4.0f, 18.0f, 5.791f, 18.0f, 8.0f)
                curveTo(18.0f, 8.718f, 17.811f, 9.391f, 17.48f, 9.974f)
                curveTo(17.27f, 9.701f, 17.005f, 9.473f, 16.701f, 9.307f)
                curveTo(16.893f, 8.912f, 17.0f, 8.468f, 17.0f, 8.0f)
                curveTo(17.0f, 6.409f, 15.762f, 5.108f, 14.197f, 5.006f)
                lineTo(14.0f, 5.0f)
                horizontalLineTo(12.0f)
                curveTo(11.724f, 5.0f, 11.5f, 4.776f, 11.5f, 4.5f)
                curveTo(11.5f, 4.255f, 11.677f, 4.05f, 11.91f, 4.008f)
                lineTo(12.0f, 4.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(6.0f, 7.5f)
                horizontalLineTo(14.0f)
                curveTo(14.276f, 7.5f, 14.5f, 7.724f, 14.5f, 8.0f)
                curveTo(14.5f, 8.245f, 14.323f, 8.45f, 14.09f, 8.492f)
                lineTo(14.0f, 8.5f)
                horizontalLineTo(6.0f)
                curveTo(5.724f, 8.5f, 5.5f, 8.276f, 5.5f, 8.0f)
                curveTo(5.5f, 7.755f, 5.677f, 7.55f, 5.91f, 7.508f)
                lineTo(6.0f, 7.5f)
                close()
                moveTo(12.0f, 12.0f)
                verticalLineTo(11.5f)
                curveTo(12.0f, 10.672f, 12.672f, 10.0f, 13.5f, 10.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 10.0f, 17.0f, 10.672f, 17.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 12.0f, 19.0f, 12.672f, 19.0f, 13.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 14.224f, 16.776f, 14.0f, 16.5f, 14.0f)
                curveTo(16.224f, 14.0f, 16.0f, 14.224f, 16.0f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.5f)
                curveTo(13.0f, 14.224f, 12.776f, 14.0f, 12.5f, 14.0f)
                curveTo(12.224f, 14.0f, 12.0f, 14.224f, 12.0f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.5f)
                curveTo(10.0f, 12.672f, 10.672f, 12.0f, 11.5f, 12.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.5f)
                curveTo(16.0f, 11.224f, 15.776f, 11.0f, 15.5f, 11.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 11.0f, 13.0f, 11.224f, 13.0f, 11.5f)
                close()
                moveTo(17.0f, 16.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 18.328f, 18.328f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(11.5f)
                curveTo(10.672f, 19.0f, 10.0f, 18.328f, 10.0f, 17.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.5f)
                curveTo(12.0f, 16.776f, 12.224f, 17.0f, 12.5f, 17.0f)
                curveTo(12.776f, 17.0f, 13.0f, 16.776f, 13.0f, 16.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.5f)
                curveTo(16.0f, 16.776f, 16.224f, 17.0f, 16.5f, 17.0f)
                curveTo(16.776f, 17.0f, 17.0f, 16.776f, 17.0f, 16.5f)
                close()
            }
        }
        .build()
        return _linkToolbox!!
    }

@Suppress("ObjectPropertyName")
private var _linkToolbox: ImageVector? = null

@Preview
@Composable
private fun LinkToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LinkToolbox, contentDescription = null)
    }
}

