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
 * TabInPrivateAccount Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, edge
 * - Description: Used in browser tab scenarios. Contains option variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tab_inprivate_account_24_regular.svg)
 * 
 * @return The [ImageVector] for the TabInPrivateAccount icon.
 */
public val FluentIcons.Regular.TabInPrivateAccount: ImageVector
    get() {
        if (_tabInPrivateAccount != null) {
            return _tabInPrivateAccount!!
        }
        _tabInPrivateAccount = Builder(name = "TabInPrivateAccount", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.231f, 4.231f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 3.0f, 21.0f, 4.231f, 21.0f, 5.75f)
                verticalLineTo(10.354f)
                curveTo(20.593f, 9.892f, 20.08f, 9.526f, 19.5f, 9.291f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.94f, 5.06f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(12.004f)
                curveTo(12.026f, 20.036f, 12.155f, 20.539f, 12.371f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21.0f, 3.0f, 19.769f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(18.0f, 14.5f)
                curveTo(17.172f, 14.5f, 16.5f, 13.828f, 16.5f, 13.0f)
                curveTo(16.5f, 12.172f, 17.172f, 11.5f, 18.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.829f)
                curveTo(20.698f, 11.627f, 20.494f, 11.288f, 20.236f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                curveTo(16.343f, 10.0f, 15.0f, 11.343f, 15.0f, 13.0f)
                curveTo(15.0f, 14.657f, 16.343f, 16.0f, 18.0f, 16.0f)
                curveTo(18.889f, 16.0f, 19.687f, 15.614f, 20.236f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.5f)
                close()
                moveTo(14.938f, 17.0f)
                curveTo(14.356f, 17.0f, 13.869f, 17.282f, 13.542f, 17.635f)
                curveTo(13.218f, 17.985f, 13.0f, 18.458f, 13.0f, 18.944f)
                verticalLineTo(19.328f)
                curveTo(13.0f, 21.289f, 15.041f, 23.0f, 18.0f, 23.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.473f)
                curveTo(21.881f, 21.712f, 22.218f, 21.373f, 22.47f, 21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.5f)
                curveTo(15.471f, 21.5f, 14.5f, 20.111f, 14.5f, 19.328f)
                verticalLineTo(18.944f)
                curveTo(14.5f, 18.898f, 14.531f, 18.775f, 14.643f, 18.654f)
                curveTo(14.75f, 18.539f, 14.86f, 18.5f, 14.938f, 18.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.73f)
                curveTo(22.652f, 17.868f, 22.56f, 17.745f, 22.458f, 17.635f)
                curveTo(22.131f, 17.282f, 21.644f, 17.0f, 21.063f, 17.0f)
                horizontalLineTo(14.938f)
                close()
                moveTo(18.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 13.351f, 20.94f, 13.687f, 20.829f, 14.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(22.919f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.328f)
                curveTo(23.0f, 19.556f, 22.972f, 19.781f, 22.919f, 20.0f)
                close()
            }
        }
        .build()
        return _tabInPrivateAccount!!
    }

@Suppress("ObjectPropertyName")
private var _tabInPrivateAccount: ImageVector? = null

@Preview
@Composable
private fun TabInPrivateAccountPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabInPrivateAccount, contentDescription = "TabInPrivateAccount Icon")
    }
}

