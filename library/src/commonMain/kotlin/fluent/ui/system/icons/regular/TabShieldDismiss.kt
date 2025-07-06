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
 * TabShieldDismiss Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, edge
 * - Description: Used in browser tab scenarios. Contains option variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tab_shield_dismiss_24_regular.svg)
 * 
 * @return The [ImageVector] for the TabShieldDismiss icon.
 */
public val FluentIcons.Regular.TabShieldDismiss: ImageVector
    get() {
        if (_tabShieldDismiss != null) {
            return _tabShieldDismiss!!
        }
        _tabShieldDismiss = Builder(name = "TabShieldDismiss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.231f, 4.231f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 3.0f, 21.0f, 4.231f, 21.0f, 5.75f)
                verticalLineTo(10.738f)
                curveTo(20.486f, 10.549f, 19.988f, 10.255f, 19.5f, 9.844f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.94f, 5.06f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(12.994f)
                curveTo(13.147f, 19.763f, 13.318f, 20.016f, 13.508f, 20.259f)
                curveTo(13.714f, 20.522f, 13.939f, 20.769f, 14.182f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21.0f, 3.0f, 19.769f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(18.355f, 10.147f)
                curveTo(19.595f, 11.389f, 20.969f, 12.0f, 22.5f, 12.0f)
                curveTo(22.746f, 12.0f, 22.95f, 12.177f, 22.992f, 12.41f)
                lineTo(23.0f, 12.5f)
                verticalLineTo(15.501f)
                curveTo(23.0f, 18.72f, 21.359f, 20.907f, 18.158f, 21.974f)
                curveTo(18.056f, 22.009f, 17.944f, 22.009f, 17.842f, 21.974f)
                curveTo(14.738f, 20.94f, 13.101f, 18.851f, 13.005f, 15.791f)
                lineTo(13.0f, 15.501f)
                verticalLineTo(12.5f)
                curveTo(13.0f, 12.224f, 13.224f, 12.0f, 13.5f, 12.0f)
                curveTo(15.029f, 12.0f, 16.404f, 11.389f, 17.647f, 10.146f)
                curveTo(17.843f, 9.951f, 18.16f, 9.951f, 18.355f, 10.147f)
                close()
                moveTo(15.966f, 13.839f)
                lineTo(15.896f, 13.896f)
                lineTo(15.839f, 13.966f)
                curveTo(15.72f, 14.136f, 15.72f, 14.364f, 15.839f, 14.534f)
                lineTo(15.896f, 14.604f)
                lineTo(17.293f, 16.0f)
                lineTo(15.896f, 17.396f)
                lineTo(15.839f, 17.466f)
                curveTo(15.72f, 17.636f, 15.72f, 17.864f, 15.839f, 18.034f)
                lineTo(15.896f, 18.104f)
                lineTo(15.966f, 18.161f)
                curveTo(16.136f, 18.279f, 16.364f, 18.279f, 16.534f, 18.161f)
                lineTo(16.604f, 18.104f)
                lineTo(18.0f, 16.707f)
                lineTo(19.396f, 18.104f)
                lineTo(19.466f, 18.161f)
                curveTo(19.636f, 18.279f, 19.864f, 18.279f, 20.034f, 18.161f)
                lineTo(20.104f, 18.104f)
                lineTo(20.161f, 18.034f)
                curveTo(20.279f, 17.864f, 20.279f, 17.636f, 20.161f, 17.466f)
                lineTo(20.104f, 17.396f)
                lineTo(18.707f, 16.0f)
                lineTo(20.104f, 14.604f)
                lineTo(20.161f, 14.534f)
                curveTo(20.279f, 14.364f, 20.279f, 14.136f, 20.161f, 13.966f)
                lineTo(20.104f, 13.896f)
                lineTo(20.034f, 13.839f)
                curveTo(19.864f, 13.72f, 19.636f, 13.72f, 19.466f, 13.839f)
                lineTo(19.396f, 13.896f)
                lineTo(18.0f, 15.293f)
                lineTo(16.604f, 13.896f)
                lineTo(16.534f, 13.839f)
                curveTo(16.388f, 13.737f, 16.2f, 13.723f, 16.042f, 13.795f)
                lineTo(15.966f, 13.839f)
                close()
            }
        }
        .build()
        return _tabShieldDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _tabShieldDismiss: ImageVector? = null

@Preview
@Composable
private fun TabShieldDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabShieldDismiss, contentDescription = "TabShieldDismiss Icon")
    }
}

