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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.LockClosedKey: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LockClosedKey",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.5f, 14f)
            curveTo(13.5f, 14.828f, 12.828f, 15.5f, 12f, 15.5f)
            curveTo(11.172f, 15.5f, 10.5f, 14.828f, 10.5f, 14f)
            curveTo(10.5f, 13.172f, 11.172f, 12.5f, 12f, 12.5f)
            curveTo(12.828f, 12.5f, 13.5f, 13.172f, 13.5f, 14f)
            close()
            moveTo(12f, 2f)
            curveTo(9.791f, 2f, 8f, 3.791f, 8f, 6f)
            verticalLineTo(7f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 7f, 4f, 8.455f, 4f, 10.25f)
            verticalLineTo(17.75f)
            curveTo(4f, 19.545f, 5.455f, 21f, 7.25f, 21f)
            horizontalLineTo(11f)
            verticalLineTo(20.914f)
            curveTo(11f, 20.384f, 11.211f, 19.875f, 11.586f, 19.5f)
            lineTo(7.25f, 19.5f)
            curveTo(6.284f, 19.5f, 5.5f, 18.716f, 5.5f, 17.75f)
            verticalLineTo(10.25f)
            curveTo(5.5f, 9.283f, 6.284f, 8.5f, 7.25f, 8.5f)
            horizontalLineTo(16.75f)
            curveTo(17.716f, 8.5f, 18.5f, 9.283f, 18.5f, 10.25f)
            verticalLineTo(11.111f)
            curveTo(18.822f, 11.038f, 19.156f, 11f, 19.5f, 11f)
            curveTo(19.669f, 11f, 19.836f, 11.009f, 20f, 11.028f)
            verticalLineTo(10.25f)
            curveTo(20f, 8.455f, 18.545f, 7f, 16.75f, 7f)
            horizontalLineTo(16f)
            verticalLineTo(6f)
            curveTo(16f, 3.791f, 14.209f, 2f, 12f, 2f)
            close()
            moveTo(9.5f, 6f)
            curveTo(9.5f, 4.619f, 10.619f, 3.5f, 12f, 3.5f)
            curveTo(13.381f, 3.5f, 14.5f, 4.619f, 14.5f, 6f)
            verticalLineTo(7f)
            horizontalLineTo(9.5f)
            verticalLineTo(6f)
            close()
            moveTo(19.5f, 19f)
            curveTo(21.433f, 19f, 23f, 17.433f, 23f, 15.5f)
            curveTo(23f, 13.567f, 21.433f, 12f, 19.5f, 12f)
            curveTo(17.567f, 12f, 16f, 13.567f, 16f, 15.5f)
            curveTo(16f, 15.806f, 16.039f, 16.104f, 16.113f, 16.387f)
            lineTo(12.293f, 20.207f)
            curveTo(12.105f, 20.395f, 12f, 20.649f, 12f, 20.914f)
            verticalLineTo(22.5f)
            curveTo(12f, 22.776f, 12.224f, 23f, 12.5f, 23f)
            horizontalLineTo(14.5f)
            curveTo(14.776f, 23f, 15f, 22.776f, 15f, 22.5f)
            verticalLineTo(22f)
            horizontalLineTo(16f)
            curveTo(16.276f, 22f, 16.5f, 21.776f, 16.5f, 21.5f)
            verticalLineTo(20.5f)
            horizontalLineTo(17.5f)
            curveTo(17.776f, 20.5f, 18f, 20.276f, 18f, 20f)
            verticalLineTo(19f)
            horizontalLineTo(19.5f)
            close()
            moveTo(20f, 14f)
            curveTo(20.552f, 14f, 21f, 14.448f, 21f, 15f)
            curveTo(21f, 15.552f, 20.552f, 16f, 20f, 16f)
            curveTo(19.448f, 16f, 19f, 15.552f, 19f, 15f)
            curveTo(19f, 14.448f, 19.448f, 14f, 20f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LockClosedKeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LockClosedKey, contentDescription = null)
    }
}
