/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.ShieldBadge: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShieldBadge",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.75f)
            curveTo(2f, 6.231f, 3.231f, 5f, 4.75f, 5f)
            horizontalLineTo(17.25f)
            curveTo(18.769f, 5f, 20f, 6.231f, 20f, 7.75f)
            verticalLineTo(10.221f)
            curveTo(19.703f, 10.089f, 19.435f, 9.919f, 19.197f, 9.735f)
            curveTo(18.933f, 9.531f, 18.728f, 9.327f, 18.593f, 9.177f)
            curveTo(18.526f, 9.103f, 18.479f, 9.044f, 18.452f, 9.01f)
            curveTo(18.438f, 8.993f, 18.43f, 8.982f, 18.427f, 8.978f)
            curveTo(18.098f, 8.518f, 17.566f, 8.245f, 17f, 8.245f)
            curveTo(16.434f, 8.245f, 15.903f, 8.518f, 15.573f, 8.978f)
            curveTo(15.57f, 8.982f, 15.562f, 8.993f, 15.549f, 9.01f)
            curveTo(15.522f, 9.044f, 15.474f, 9.103f, 15.407f, 9.177f)
            curveTo(15.272f, 9.327f, 15.068f, 9.531f, 14.803f, 9.735f)
            curveTo(14.266f, 10.15f, 13.572f, 10.495f, 12.75f, 10.495f)
            curveTo(11.781f, 10.495f, 10.995f, 11.281f, 10.995f, 12.25f)
            verticalLineTo(15f)
            lineTo(4.75f, 15f)
            curveTo(3.231f, 15f, 2f, 13.769f, 2f, 12.25f)
            verticalLineTo(7.75f)
            close()
            moveTo(15.573f, 8.978f)
            curveTo(15.575f, 8.977f, 15.575f, 8.976f, 15.573f, 8.978f)
            close()
            moveTo(18.583f, 10.531f)
            curveTo(18.225f, 10.255f, 17.881f, 9.933f, 17.612f, 9.567f)
            curveTo(17.472f, 9.368f, 17.244f, 9.25f, 17f, 9.25f)
            curveTo(16.757f, 9.25f, 16.528f, 9.369f, 16.387f, 9.568f)
            curveTo(16.118f, 9.933f, 15.775f, 10.255f, 15.417f, 10.531f)
            curveTo(15.105f, 10.772f, 14.733f, 11.005f, 14.307f, 11.183f)
            curveTo(13.849f, 11.374f, 13.327f, 11.5f, 12.75f, 11.5f)
            curveTo(12.336f, 11.5f, 12f, 11.836f, 12f, 12.25f)
            verticalLineTo(15f)
            curveTo(12f, 16.643f, 12.438f, 17.947f, 13.299f, 18.98f)
            curveTo(14.145f, 19.996f, 15.343f, 20.68f, 16.737f, 21.202f)
            curveTo(16.906f, 21.266f, 17.094f, 21.266f, 17.263f, 21.202f)
            curveTo(18.657f, 20.68f, 19.855f, 19.996f, 20.701f, 18.98f)
            curveTo(21.562f, 17.947f, 22f, 16.643f, 22f, 15f)
            verticalLineTo(12.25f)
            curveTo(22f, 11.836f, 21.664f, 11.5f, 21.25f, 11.5f)
            curveTo(20.673f, 11.5f, 20.152f, 11.374f, 19.693f, 11.183f)
            curveTo(19.267f, 11.005f, 18.895f, 10.772f, 18.583f, 10.531f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShieldBadgePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShieldBadge, contentDescription = null)
    }
}
