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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.TableSimpleInclude: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleInclude",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 11.25f)
            horizontalLineTo(20.845f)
            curveTo(20.254f, 10.634f, 19.422f, 10.25f, 18.5f, 10.25f)
            horizontalLineTo(13.5f)
            curveTo(13.242f, 10.25f, 12.991f, 10.28f, 12.75f, 10.337f)
            verticalLineTo(3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(11.25f)
            close()
            moveTo(10.25f, 13.5f)
            curveTo(10.25f, 13.242f, 10.28f, 12.991f, 10.337f, 12.75f)
            horizontalLineTo(3f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(11.25f)
            verticalLineTo(20.845f)
            curveTo(10.634f, 20.254f, 10.25f, 19.422f, 10.25f, 18.5f)
            verticalLineTo(13.5f)
            close()
            moveTo(11.155f, 11.25f)
            curveTo(11.186f, 11.218f, 11.218f, 11.186f, 11.25f, 11.155f)
            verticalLineTo(3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(11.25f)
            horizontalLineTo(11.155f)
            close()
            moveTo(11.25f, 13.5f)
            curveTo(11.25f, 12.257f, 12.257f, 11.25f, 13.5f, 11.25f)
            horizontalLineTo(18.5f)
            curveTo(19.743f, 11.25f, 20.75f, 12.257f, 20.75f, 13.5f)
            verticalLineTo(18.5f)
            curveTo(20.75f, 19.743f, 19.743f, 20.75f, 18.5f, 20.75f)
            horizontalLineTo(13.5f)
            curveTo(12.257f, 20.75f, 11.25f, 19.743f, 11.25f, 18.5f)
            verticalLineTo(13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableSimpleIncludePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableSimpleInclude, contentDescription = null)
    }
}
